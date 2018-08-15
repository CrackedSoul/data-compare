package com.vic.data.compare.Utils;

public class BubbleSortTest {

	public static void main(String args[]) {
		char[] a = { 'x', 'i', 'a', 'o' };
		char[] b = { 'c', 'a', 'n', 'b' };
		Integer[] sort = { 11, 4, 5, 3, 15, 6, 9, 8, 16, 24, 19 };
		MergeSort.sortNumber1(sort);
		System.out.println(a);
		System.out.println(b);
	}

	private static void swap(char[] a, char[] b) {
		char[] a1 = b;
		b = a;
		a = a1;
	}

}
