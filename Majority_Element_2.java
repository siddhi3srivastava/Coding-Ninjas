/*You are given an array/list 'ARR' of integers of length ‘N’. You are supposed to find all the elements that occur strictly more than floor(N/3) times in the given array/list.*/

// time-complexity: O(n)

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
  		ArrayList<Integer> ans= new ArrayList<>();
      HashMap<Integer, Integer> map= new HashMap<>();
  		for(int i=0; i<arr.size(); i++){
  			if(map.containsKey(arr.get(i))){
  				map.put(arr.get(i), map.get(arr.get(i))+1);
  			}
  			else{
  				map.put(arr.get(i), 1);
  			}
  		}
  		for(int i=0; i<arr.size(); i++){
  			if(map.get(arr.get(i))>arr.size()/3 && !ans.contains(arr.get(i))){
  				ans.add(arr.get(i));
  			}
  		}
  	
  		return ans;

    }
}
