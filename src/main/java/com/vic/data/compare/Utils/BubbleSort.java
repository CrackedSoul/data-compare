package com.vic.data.compare.Utils;

import com.vic.data.compare.ComResult;
import com.vic.data.compare.Comparator;

public class BubbleSort {
	public static Number[] sortNumber(Number[] in) {
		for (int o = 1; o < in.length; o++) {
			for (int i = 0; i < in.length - o; i++) {
				if (Comparator.compareNumber(in[i], in[i + 1]).equals(ComResult.greater)) {
					Comparator.swap(in, i, i + 1);
					Number tem;
					tem = in[i];
					in[i] = in[i + 1];
					in[i + 1] = tem;
				}
			}
		}
		return in;
	}
}
