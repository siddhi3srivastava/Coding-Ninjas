/*You are provided with the two strings named X and Y respectively. Y has its own specific order and has no repeating characters. 
Your task is to arrange the characters of the first string i.e. X in such a way that the order of characters in X is exactly the 
same as in Y, which means if ‘d’ occurs after ‘c’ in Y then it should also occur after ‘c’ in X ( obviously if X has ‘d’ and ‘c’ 
as characters in it ). All you have to do is, convert string X in the specific order with respect to string Y.
Note :
Both the strings have only lowercase English alphabets. 
There may be more than one correct solution, you have to return any one of the possible solutions.*/

import java.util.* ;
import java.io.*; 
public class Solution {
    public static String specificOrder(String x, String y) {
        //greedy approach
        Map<Character, Integer> freq= new HashMap<>();
        for(int i=0; i<x.length(); i++){
            char ch=x.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }
            else{
                freq.put(ch, 1);
            }

        }
        StringBuilder ans= new StringBuilder();
        for(int i=0; i<y.length(); i++){
            char ch=y.charAt(i);
            if(freq.containsKey(ch)){
                int count=freq.get(ch);
                for(int j=0; j<count; j++){
                    ans.append(ch);
                }
                freq.remove(ch);
            }
        }
        for(int i=0; i<x.length(); i++){
            char ch=x.charAt(i);
            if(freq.containsKey(ch)){
                ans.append(ch);
                freq.put(ch, freq.get(ch)-1);
                if(freq.get(ch)==0){
                    freq.remove(ch);
                }
            }
        }
        return ans.toString();

    }
}
