/*
Problem Statement : Given an array were each element is repeting 3 times, find the unique element from array.

ex : [1,1,1,2,2,2,3,3,3,4]

o/p : 4

*/

public class findUniqueElementFriquencyThree {
    public static void finduniqueElement(int [] arr){
        int ans = 0;
        for(int i = 0;i<31;i++){
            int count = 0;
            for(int j = 0;j<arr.length;j++){
                if((arr[j] & (1 << i)) > 0 ){ // ith bit is set in arr[i]
                    count++;
                }
            }
            if(count % 3 != 0){
                ans = (ans | (1 << i));
            }
        }
        System.out.println("The ans is "+ans);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,1,1,2,2,2,3,3,3};
		finduniqueElement(arr);
	}
}
