/* You are given a sorted integer array 'arr' of size 'n'.
You need to remove the duplicates from the array such that each element appears only once.
Return the length of this new array.
Note:
Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory. */

import java.util.HashSet;
public class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        if(arr.length==0){
            return 0;
        }

        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        return set.size();


    }
}

