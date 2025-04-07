/*You are given a binary string ‘STR’, containing only zeroes and ones. This string does not contain any leading zero.

Your task is to determine if this string contains at most one contiguous segment of ones.*/

// time-complexity: O(n)

import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean oneSegment(String str) 
	{
		
		boolean check=false;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='0'){
				check=true;
			}
			else if(str.charAt(i)=='1' && check){
				return false;
			}
		}
		return true;
	}
}
