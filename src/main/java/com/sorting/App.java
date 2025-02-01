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

	void mergeSort(int[] a, int s, int e) {
		if (s == e)
			return;
		int mid = s + (e - s) / 2;
		mergeSort(a, s, mid);
		mergeSort(a, mid + 1, e);
		merge(a, s, mid, e);

	}

	void merge(int[] a, int s, int m, int e) {

		int[] temp = new int[(e - s + 1)];
		int k = 0;
		int i = s;
		int j = m + 1;
		while (i <= m && j <= e) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}

		while (i <= m) {
			temp[k++] = a[i++];
		}

		while (j <= e) {

			temp[k++] = a[j++];
		}

		for (int l = 0; l < temp.length; l++) {
			a[s + l] = temp[l];
		}

	}

	public static void main(String[] args) {

		int[] a = { 7, 2, 9, 8, 5, 6,7,4,9,1,0 };
		new App().mergeSort(a, 0, a.length-1
				);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
