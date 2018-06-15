package com.vic.data.compare.Utils;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		Number[] numbers = { 1, 4, 15, 65, 3, 21, 14, 46, 25, 24 };
		HeapSort.sortNumber(numbers);
		for (Number integer : numbers) {
			System.out.println(integer);
		}
		System.out.println("---------------");
		HeapSort.makeMaxHeap(numbers, numbers.length);
		for (Number integer : numbers) {
			System.out.println(integer);
		}
	}

}
