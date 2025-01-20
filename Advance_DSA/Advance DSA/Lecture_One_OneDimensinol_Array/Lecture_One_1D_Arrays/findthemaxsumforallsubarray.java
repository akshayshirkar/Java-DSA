/* probelem statement ; We have gievn the array and we need to find the max sum of
sub array out of all the sub array*/

// This approch is brute force approch

public class findthemaxsumforallsubarray {
    public static void main(String[] args) {
		int [] arr = {1,2,3};
		int max_sum = 0;
		for(int Start = 0; Start<arr.length; Start++) {
			for(int end = Start; end<arr.length; end++) {
			    int current_Sum=0;
				for(int k =Start; k<=end; k++ ) {
					//System.out.print(arr[k]);
					current_Sum = current_Sum + arr[k];
					if(current_Sum > max_sum){
					    max_sum = current_Sum;
					}
				}
			}
		}
		System.out.println("current_Sum "+max_sum);
	}
}
