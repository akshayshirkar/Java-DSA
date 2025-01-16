public class prefixsumpactice {
    public static void main(String[] args) {
		int [] arr = {1,2,3};
		for(int i =1; i<arr.length; i++) {
			arr[i] += arr[i-1];
		}
		for(int j = 0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}
