/*
Problme statament :

Given an Integer array were every element is '0' return final array after performing
multiple queries.

Query(x,i) : add 'x' element from i to n-1

Approch : Optimised  [We reached to this approch by using prefix sum]

No need to add x to every element if we add the element at index i and then we 
calculate the prefix sum then time complexity will be reduced.

*/

public class sumafterperformingqueriesOptimiesed {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {0,0,0,0,0,0,0};
		int [][] queries = {{1,3},{4,2},{3,1}};
		
		for(int k = 0;k<queries.length;k++){
		    int i = queries[k][0];
		    int x = queries[k][1];
		    arr[i] += x;
		}
		
		for(int j = 1;j<arr.length;j++){
		    arr[j] += arr[j-1];
		}
		
		//this loop is to print the entire array
		for(int i = 0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
}
