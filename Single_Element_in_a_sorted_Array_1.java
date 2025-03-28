/*You are given a sorted array ‘arr’ of ‘n’ numbers such that every number occurred twice in the array except one, which appears only once.
Return the number that appears once.*/

// time complexity: O(N)
// space complexity: O(N)

import java.util.HashMap;
import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
       //Using HashMap approach, not suitable and optimal for large test cases.
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<arr.size(); i++){
            map.put(arr.get(i), map.getOrDefault(arr.get(i),0)+1);
        }
        for(int i=0; i<arr.size(); i++){
            if(map.get(arr.get(i))==1){
                return arr.get(i);
            }
        }
        
        return -1;
    
    }
}
