/*Ninja loves playing with numbers. So his friend gives him an array on his birthday.
  The array consists of positive and negative integers. Now Ninja is interested in finding the length of the longest subarray whose sum is zero. */

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int n=arr.size();
		Map<Integer, Integer> map= new HashMap<>();
		int max=0;
		int sum=0;
		for(int i=0; i<n; i++){
			sum+=arr.get(i);
			if(sum==0){
				max=i+1;
			}
			if(map.containsKey(sum)){
				int last_index=map.get(sum);
				max=Math.max(max, i-last_index);
			}
			else{
				map.put(sum, i);
			}

		}
		return max;

	}
}
