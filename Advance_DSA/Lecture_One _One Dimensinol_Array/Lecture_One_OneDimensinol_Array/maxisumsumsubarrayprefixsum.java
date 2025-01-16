public class maxisumsumsubarrayprefixsum {
    public static void main(String[] args) {
		int [] arr = {1,2,3};
		// crete the prefix sum array
		for(int i = 1; i<arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		int max_sum=0;
		for(int start = 0; start<arr.length; start++) {
			for(int end = start ; end<arr.length; end++) {
			    int current_Sum = 0;
				if(start == 0) {
					current_Sum = arr[end];
				} else {
					current_Sum = arr[end] - arr[start - 1];
				}
				if(current_Sum > max_sum) {
					max_sum = current_Sum;
				}
			}
		}
		System.out.println("max_sum is "+max_sum);
	}
}
