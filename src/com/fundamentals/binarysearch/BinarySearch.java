package com.fundamentals.binarysearch;

public class BinarySearch {

	public static int binarySearch(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		
		while(hi >= lo) {
			int mid = lo + (hi - lo) / 2;
			
			if(key > a[mid]) lo = mid + 1;
			else if(key < a[mid]) hi = mid - 1;
			else return mid;
		}
		
		return -1;
	}
}
