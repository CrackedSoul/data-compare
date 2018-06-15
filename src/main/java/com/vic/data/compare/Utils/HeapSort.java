package com.vic.data.compare.Utils;

import com.vic.data.compare.ComResult;
import com.vic.data.compare.Comparator;

public class HeapSort {
	public static Number[] sortNumber(Number[] in) {
		makeMaxHeap(in, in.length);
		for (int i = 0; i < in.length; i++) {
			Comparator.swap(in, 0, in.length - 1 - i);
			loopMakeMax(in, 0, in.length - 1 - i);
		}
		return in;
	}

	public static void makeMinHeap(Number[] in, int length) {
		for (int i = in.length - 1; i >= 0; i--) {
			if (Comparator.compareNumber(in[i], in[((i - 1) / 2)]).equals(ComResult.less)) {
				Comparator.swap(in, i, (i - 1) / 2);
				loopMakeMin(in, i, length);
			}
		}
	}

	public static void makeMaxHeap(Number[] in, int length) {
		for (int i = length - 1; i >= 0; i--) {
			if (Comparator.compareNumber(in[i], in[((i - 1) / 2)]).equals(ComResult.greater)) {
				Comparator.swap(in, i, (i - 1) / 2);
				loopMakeMax(in, i, length);
			}
		}
	}

	private static void loopMakeMax(Number[] in, int i, int length) {
		if (length - 1 >= 2 * i + 1) {
			if (Comparator.compareNumber(in[i], in[2 * i + 1]).equals(ComResult.less)) {
				Comparator.swap(in, i, 2 * i + 1);
				loopMakeMax(in, 2 * i + 1, length);
			}
		}
		if (length - 1 >= 2 * i + 2) {
			if (Comparator.compareNumber(in[i], in[2 * i + 2]).equals(ComResult.less)) {
				Comparator.swap(in, i, 2 * i + 2);
				loopMakeMax(in, 2 * i + 2, length);
			}
		}
	}

	private static void loopMakeMin(Number[] in, int i, int length) {
		if (length - 1 >= 2 * i + 1) {
			if (Comparator.compareNumber(in[i], in[2 * i + 1]).equals(ComResult.greater)) {
				Comparator.swap(in, i, 2 * i + 1);
				loopMakeMin(in, 2 * i + 1, length);
			}
		}
		if (length - 1 >= 2 * i + 2) {
			if (Comparator.compareNumber(in[i], in[2 * i + 2]).equals(ComResult.greater)) {
				Comparator.swap(in, i, 2 * i + 2);
				loopMakeMin(in, 2 * i + 2, length);
			}
		}
	}
}
