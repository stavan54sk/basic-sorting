package com.sorting;

/**
 * Hello world!
 *
 */
public class App {

	void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			boolean isSorted = true;
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				return;
			}

		}

	}

	void selectionSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int minIdex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIdex]) {
					int temp = a[minIdex];
					a[minIdex] = a[j];
					a[j] = temp;

				}

			}

		}

	}

	void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int c = a[i];
			int p = i - 1;
			while (p >= 0 && a[p] > c) {
				a[p + 1] = a[p];
				p--;

			}
			a[p + 1] = c;
		}

	}

	public static void main(String[] args) {

		int[] a = { 5, 6, 7, 2, 9, 8 };
		new App().insertionSort(a, 6);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
