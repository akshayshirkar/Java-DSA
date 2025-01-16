import java.util.Arrays;

public class findcost {
    public static void findoutTheCost(int [] arr) {
		int n = arr.length;
		int cost = 0;
		// This method will sort the array in acending order
		Arrays.sort(arr);
		for(int i = n-1; i>=0; i--) {

			cost+=arr[i]*(n-i);
		}
		System.out.println("The cost of the array is"+cost);
	}

public static void main(String[] args) {
	System.out.println("Hello World");
	int [] arr = {3,5,1,-3};
	findoutTheCost(arr);
}
}
