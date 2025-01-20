/* probelem statement ; We have gievn the array and we need to find the max sum of
sub array out of all the sub array*/

// This approch is brute force approch
public class maxsumsubarrayCarrayForward {
    public static void main(String[] args) {
		//System.out.println("Hello World");
		int [] arr = {1,2,3};
		int max_sum = 0;
		for(int i =0;i<arr.length;i++){
		    int sum = 0;
		    for(int j = i;j<arr.length;j++){
		        sum += arr[j]; 
		    }
		    if(sum  > max_sum){
		        max_sum = sum;
		    }
		}
		System.out.println("Max sum is "+max_sum);
	}
}
