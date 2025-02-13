public class findMissingNaturalNumber {
    public static int findMissingNaturalNum(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != i+1) {
				while(arr[i] != i+1 && arr[i] > 0 && arr[i] <= n) {
					if(arr[i] == arr[arr[i]-1]); break;
					int temp1 = arr[i];
					arr[i] = arr[arr[i]-1];
					arr[arr[i]-1] = temp1;
				}
			}
		}
		for(int i = 0; i<n; i++) {
			if(arr[i] != i+1) {
				//System.out.println("Missing elment is "+(i+1));
				return i+1;
			} 
		}
		return n+1;
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {2,3,1,2};
		
		int missingNumber = findMissingNaturalNum(arr);
		System.out.println("Missing Number is "+missingNumber);
	}
}
