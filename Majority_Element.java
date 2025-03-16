/*You have been given an array/list 'ARR' consisting of 'N' integers. Your task is to find the majority element in the array. If there is no majority element present, print -1.
Note:
A majority element is an element that occurs more than floor('N' / 2) times in the array. */

public class Solutiom{
  public static int findMajority(int[] arr, int n){
    HashMap<Integer, Integer> map= new HashMap<>();
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i], 1);
			}
			if(map.get(arr[i])>arr.length/2){
				return 	arr[i];
			}
		}
		return -1;
	}
}
