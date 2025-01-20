/*
Problem statement :

Given n buildings with height of each building find the rain water trapped
under the building.

Approch : Bruteforce.

*/
public class rainwatertrapped_Bruteforce {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {2, 1, 4, 2, 1, 2, 4, 3, 2, 1, 1, 3, 1};

		// Edge case: If there are less than 3 buildings, no water can be trapped.
		if (arr.length < 3) {
			System.out.println("total_Water_trapped => 0");
			return;
		}

		int n = arr.length;
		int total_Water_trapped = 0;

		// Create arrays to store the max height to the left and right of each building
		int[] max_left = new int[n];
		int[] max_right = new int[n];

		// Compute max_left array
		max_left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			max_left[i] = Math.max(arr[i], max_left[i - 1]);
		}

		// Compute max_right array
		max_right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			max_right[i] = Math.max(arr[i], max_right[i + 1]);
		}

		// Calculate total water trapped
		for (int i = 0; i < n; i++) {
			total_Water_trapped += Math.min(max_left[i], max_right[i]) - arr[i];
		}

		System.out.println("total_Water_trapped => " + total_Water_trapped);
	}

}
