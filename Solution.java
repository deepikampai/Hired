package com.hired.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
//	public static long solution(long[] numbers) {
//        
//    	}
//    
    public static void main(String[] args){
      List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.toArray();
        for(int i = 0; i< numbers.size(); i++){
           System.out.println(numbers); 
        } 
        
        Integer[] num = {};
        List<Integer> newNum = new  ArrayList<>(Arrays.asList(num));
        
        int result = solution(num);
        System.out.println("Large number is:" +result);
        
        
        
    }
    
    public static Integer solution(Integer num[]) {
    	if(num.length==0){
            return 0;
        }else{
            int large = num[0];
            for(int i = 0; i<num.length;i++){
                if(num[i]> large){
                    large = num[i];
                }
            }
            return large;
        }
    }

}
