package com.vic.data.compare.Utils;

import com.vic.data.compare.ComResult;
import com.vic.data.compare.Comparator;

public class MergeSort {
	public static Number[] sortNumber(Number[] in) {

		int rex = 1;
		while (in.length >= (1 << rex - 1)) {
			int start;
			int mid;
			int end = 0;
			for (start = 0; end < in.length - 1;) {
				mid = start + (1 << (rex - 1));
				end = (start + 2 * (1 << rex - 1) - 1) > (in.length - 1) ? (in.length - 1)
						: (start + 2 * (1 << rex - 1) - 1);
				mergeSort(in, start, mid, end);
				start = end + 1;
			}
			rex++;
		}
		return in;
	}

	private static void mergeSort(Number[] in, int start, int mid, int end) {
		int temmid = mid;
		int tmpend = end;
		Number[] tem = new Number[in.length];
		for (int i = start; i <= end; i++) {
			tem[i] = in[i];
		}
		for (int i = start; i <= end; i++) {
			if (mid > tmpend) {
				in[i] = tem[start++];
			} else if (start >= temmid) {
				in[i] = tem[mid++];
			} else if (Comparator.compareNumber(tem[start], tem[mid]).equals(ComResult.less)) {
				in[i] = tem[start++];
			} else {
				in[i] = tem[mid++];
			}
		}
	}
}
