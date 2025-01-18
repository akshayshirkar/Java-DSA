/* probelem statement ; We have gievn the array and we need to find the max sum of
sub array out of all the sub array*/

// This approch is optimised approch force approch
public class kadanesAlgotitham {
    public static void main(String[] args) {
		int [] arr = {1,2,3};
		int current_Sum=0;
		int max_Sum = 0;

		for(int i = 0; i<arr.length; i++) {
			if(current_Sum + arr[i] > 0) {
				current_Sum+=arr[i];
			} else {
				current_Sum = 0;
			}
		}
		if(current_Sum > max_Sum) {
			max_Sum = current_Sum;
			System.out.println("The max sum is "+max_Sum);
		}

	}
}
