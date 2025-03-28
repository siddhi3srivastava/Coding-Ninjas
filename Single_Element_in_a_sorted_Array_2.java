/*You are given a sorted array ‘arr’ of ‘n’ numbers such that every number occurred twice in the array except one, which appears only once.
Return the number that appears once.*/

// time complexity : O(N)
// space complexity : O(1)

//Using bitwise XOR operation, can be used for unsorted array

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int uniq=0;
        for(int i=0; i<arr.size(); i++){
            uniq^=arr.get(i);
        }
        return uniq;
    }
}
