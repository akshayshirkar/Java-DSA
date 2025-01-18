/*
Problme statament :

Given an Integer array were every element is '0' return final array after performing
multiple queries.

Query(x,i) : add 'x' element from i to n-1

Approch : Brute force.
*/

public class sumafterperformingqueries {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {0,0,0,0,0,0,0};
		int [][] queries = {{1,3},{4,2},{3,1}};

		for(int i = 0; i<queries.length; i++) {
			int x = queries[i][0];
			int k = queries[i][1];
			for(int j = x; j<arr.length; j++) {
				arr[j] += k;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
