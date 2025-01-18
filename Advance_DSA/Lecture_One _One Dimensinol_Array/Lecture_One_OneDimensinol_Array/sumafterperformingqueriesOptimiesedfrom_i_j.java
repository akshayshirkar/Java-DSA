/*

Given an integer array were every element is '0'.

Return the final array after performing multiple queries.

queries(i,j,x) : add x to all the elements from i to j;

*/

public class sumafterperformingqueriesOptimiesedfrom_i_j {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {0,0,0,0,0,0,0};
		int [][][] queries  = {{{1,3,2}},{{2,5,3}},{{5,6,-1}}};
		
		for(int q =0;q<queries.length;q++){
		    int i = queries[q][0][0];
		    int j = queries[q][0][1];
		    int x = queries[q][0][2];
		    
		    arr[i] += x;
		    
		    if( j + 1 < arr.length){
		        arr[j + 1] -= x;
		    }
		}
		
		
		for(int i = 1;i<arr.length;i++){
		    arr[i] += arr[i-1];
		}
		// this code is to print the array
		for(int i = 0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
		
	}
}
