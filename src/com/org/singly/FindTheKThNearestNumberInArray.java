package com.org.singly;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
* Find k nearest numbers (by difference) to given num from array.
Arr= 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 2, 4, 8, 16, 32 
Num=13, K=4
output = 11, 13, 15, 16
*/

public class FindTheKThNearestNumberInArray {

	public static void main(String[] args) {

		int arr[]= {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 2, 4, 8, 16, 32};
		int num=13;
		int k=4;
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
	}

}
