package com.hired.assessment;

import java.util.ArrayList;

public class TreeTest {
	
	public static void main(String args[]) {
		TreeTest t = new TreeTest();
		long[] l = {3,6,2,9,-1,13}; 
		String output =t.test(l);
		System.out.println("output ->" +output);
	}
	
	public String test(long arr[]) {
		
		if(arr.length == 0) return "";
		ArrayList<Long> newArray = new ArrayList<Long>();
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==-1) continue;
			newArray.add(Long.valueOf(arr[i]));
		}
		System.out.println("New Array "+newArray);
		ArrayList<Long> leftArray = new ArrayList<Long>();
		ArrayList<Long> rightArray = new ArrayList<Long>();
		
		for(int j =0;j< newArray.size();j++) {
			if(j == 0) {
				leftArray.add(newArray.get(j));
				rightArray.add(newArray.get(j));
				continue;
			}
			if(j % 2 == 0) {
				rightArray.add(newArray.get(j));
			}else {
				leftArray.add(newArray.get(j));
			}
		}
		
		System.out.println(" Left Array "+leftArray );
		System.out.println(" Right Array "+rightArray );
		long leftSum = 0;
		long rightSum = 0;
		
		for(int k =0;k< leftArray.size();k++) {
			leftSum = leftSum + leftArray.get(k).longValue();
		}
		for(int k =0;k < rightArray.size();k++) {
			rightSum = rightSum + rightArray.get(k).longValue();
		}
		System.out.println("Left Sum "+leftSum+" Right Sum "+rightSum);
		if(leftSum == rightSum) return "Empty";
		if(leftSum > rightSum) return "Left" ; else return "Right";
		
		
	}
	
	
}
