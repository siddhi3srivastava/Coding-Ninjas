/*You are given an integer N. Your task is to return a 2-D ArrayList containing the pascal’s triangle till the row N.

A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. Pascal's triangle contains the values of the binomial coefficient. */

//time-complexity: O(n^2)

import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> outside= new ArrayList<>();
		for(int i=0; i<n; i++){
			ArrayList<Long> inside= new ArrayList<>();
			for(int j=0; j<=i; j++){
				if(j==0 || i==j){
					inside.add(Long.valueOf(1));
				}
				else{
					inside.add(outside.get(i-1).get(j-1)+outside.get(i-1).get(j));
				}
			}
		outside.add(inside);
		}
	return outside;
		
	}
}
