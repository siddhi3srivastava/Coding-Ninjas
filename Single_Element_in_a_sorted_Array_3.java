/*You are given a sorted array ‘arr’ of ‘n’ numbers such that every number occurred twice in the array except one, which appears only once.
Return the number that appears once.*/

// time complexity: O(logN)
// space complexity: O(1)

import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
      //Using binary search for faster and more optimal solution
        int start=0;
        int last=arr.size()-1;
        while(start<last){
            int mid=start+(last-start)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr.get(mid).equals(arr.get(mid+1))){
                start=mid+2;
            }
            else{
                last=mid;
            }
        }
        return arr.get(start);
    }
}
