package com.vic.data.compare.Utils;

import com.vic.data.compare.ComResult;
import com.vic.data.compare.Comparator;

public class ShellSort {
	public static Number[] sortNumber(Number[] in) {
		for (int inc = in.length / 2; inc > 0;) {
			shellSort(in, inc);
			inc /= 2;
		}
		return in;
	}

	private static void shellSort(Number[] in, int inc) {
		for (int o = 0; o < inc; o++) {
			for (int i = o; i < in.length;) {
				inn: for (int inn = i + inc; (inn - inc >= 0 && inn < in.length);) {
					if (Comparator.compareNumber(in[inn], in[inn - inc]).equals(ComResult.less)) {
						Comparator.swap(in, inn, inn - inc);
					} else {
						break inn;
					}
					inn -= inc;
				}
				i += inc;
			}
		}
	}

}
