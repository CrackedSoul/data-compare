package com.vic.data.compare.Utils;

import com.vic.data.compare.ComResult;
import com.vic.data.compare.Comparator;

public class QuickSort {
	public static Number[] sortNumber(Number[] in) {
		quick(in, 0, in.length - 1);
		return in;
	}

	private static void quick(Number[] in, int start, int end) {
		int index = start + 1;
		for (int i = start + 1; i <= end; i++) {
			if (Comparator.compareNumber(in[i], in[start]).equals(ComResult.less)) {
				Comparator.swap(in, i, index);
				index++;
			}
		}
		Comparator.swap(in, start, index - 1);
		if (index - start > 2) {
			quick(in, start, index - 2);
		}
		if (end - index > 0) {
			quick(in, index, end);
		}
	}
}
