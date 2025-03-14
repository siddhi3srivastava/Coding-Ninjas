import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) {
		//write your code here
		Map <Character, Integer> seq= new HashMap<>();
		int max=0;
		int start=0;
		for(int i=0; i<input.length(); i++){
			char ch=input.charAt(i);
			if(seq.containsKey(ch)){
				start=Math.max(start, seq.get(ch)+1);

			}
			seq.put(ch, i);
			max=Math.max(max, i-start+1);
		}
		return max;
	}
}
