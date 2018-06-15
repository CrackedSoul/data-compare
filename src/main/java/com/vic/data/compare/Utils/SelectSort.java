package com.vic.data.compare.Utils;

import com.vic.data.compare.ComResult;
import com.vic.data.compare.Comparator;

public class SelectSort {
	public static Number[] sortNumber(Number[] in) {
		for (int o = 0; o < in.length; o++) {
			int temindex = 0;
			for (int i = 1; i < in.length - o; i++) {
				if (Comparator.compareNumber(in[temindex], in[i]).equals(ComResult.less)) {
					temindex = i;
				}
			}
			Number tem;
			tem = in[in.length - o - 1];
			in[in.length - o - 1] = in[temindex];
			in[temindex] = tem;
		}
		return in;
	}
}
