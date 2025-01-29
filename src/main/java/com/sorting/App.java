package com.sorting;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App {

	void bubblesort(int[] a, int n) {
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

	public static void main(String[] args) {

		int[] a = { 5, 6, 7, 2, 9, 8 };
		new App().bubblesort(a, 6);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
