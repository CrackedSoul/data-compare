package com.vic.data.compare.Utils;

import com.vic.data.compare.Comparator;

public class InsertSort {
	public static Number[] sortNumber(Number[] in) {
		for (int o = 1; o < in.length; o++) {
			in: for (int i = o - 1; i >= 0; i--) {
				switch (Comparator.compareNumber(in[i + 1], in[i])) {
				case less:
					Comparator.swap(in, i, i + 1);
					break;
				case equals:
					break in;
				case greater:
					break in;
				}
			}
		}
		return in;
	}
}
