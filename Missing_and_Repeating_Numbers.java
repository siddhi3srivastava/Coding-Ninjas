/*You are given an array of size ‘N’. The elements of the array are in the range from 1 to ‘N’.

Ideally, the array should contain elements from 1 to ‘N’. But due to some miscalculations, there is a number R in the range [1, N] which appears in the array twice and another number M in the range [1, N] which is missing from the array.

Your task is to find the missing number (M) and the repeating number (R).

For example:
Consider an array of size six. The elements of the array are { 6, 4, 3, 5, 5, 1 }. 
The array should contain elements from one to six. Here, 2 is not present and 5 is occurring twice. Thus, 2 is the missing number (M) and 5 is the repeating number (R). */

// time-complexity:O(n)
// space-complexity: O(n)

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        HashSet<Integer>set= new HashSet<>();
        int sum=0;
        int dupe=0;
        int[] ans= new int[2];
        for(int i=0; i<n; i++){
            if(set.contains(arr.get(i))){
                dupe=arr.get(i);
            }
            set.add(arr.get(i));
            sum+=arr.get(i);  
        }
        int miss=(n*(n+1))/2-(sum-dupe);
        ans[0]=miss;
        ans[1]=dupe;
        return ans;

        
    }
}
