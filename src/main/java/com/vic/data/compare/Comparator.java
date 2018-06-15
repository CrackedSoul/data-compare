package com.vic.data.compare;

public class Comparator {

	public static ComResult compareNumber(Number n1, Number n2) {
		if (n1 instanceof Integer) {
			if (n1.intValue() > n2.intValue()) {
				return ComResult.greater;
			} else if (n1.intValue() == n2.intValue()) {
				return ComResult.equals;
			} else if (n1.intValue() < n2.intValue()) {
				return ComResult.less;
			}
		} else if (n1 instanceof Double) {
			if (n1.doubleValue() > n2.doubleValue()) {
				return ComResult.greater;
			} else if (n1.doubleValue() == n2.doubleValue()) {
				return ComResult.equals;
			} else if (n1.doubleValue() < n2.doubleValue()) {
				return ComResult.less;
			}
		} else if (n1 instanceof Long) {
			if (n1.longValue() > n2.longValue()) {
				return ComResult.greater;
			} else if (n1.longValue() == n2.longValue()) {
				return ComResult.equals;
			} else if (n1.longValue() < n2.longValue()) {
				return ComResult.less;
			}
		} else if (n1 instanceof Float) {
			if (n1.floatValue() > n2.floatValue()) {
				return ComResult.greater;
			} else if (n1.floatValue() == n2.floatValue()) {
				return ComResult.equals;
			} else if (n1.floatValue() < n2.floatValue()) {
				return ComResult.less;
			}
		} else if (n1 instanceof Byte) {
			if (n1.byteValue() > n2.byteValue()) {
				return ComResult.greater;
			} else if (n1.byteValue() == n2.byteValue()) {
				return ComResult.equals;
			} else if (n1.byteValue() < n2.byteValue()) {
				return ComResult.less;
			}
		} else if (n1 instanceof Short) {
			if (n1.shortValue() > n2.shortValue()) {
				return ComResult.greater;
			} else if (n1.shortValue() == n2.shortValue()) {
				return ComResult.equals;
			} else if (n1.shortValue() < n2.shortValue()) {
				return ComResult.less;
			}
		}
		return ComResult.uncompare;
	}

	public static void swap(Number[] in, int a, int b) {
		Number tem = in[a];
		in[a] = in[b];
		in[b] = tem;
	}
}
