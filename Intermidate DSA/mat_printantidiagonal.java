import java.util.Scanner;

public class mat_printantidiagonal {
    // this code is to print the antidiagonals
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		int [][] arr = new int[3][3];
		// this loop is to get the elements for 2d array
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// this loop is to print the 2d array
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		System.out.println("");
		
		// this code is to print the antidiagonals elemnts
		int i = 0;
		int n =  arr.length;
		int j =n-1;
		while(i<n && j >= 0) {
			System.out.println(arr[i][j]);
			i++;
			j--;
		}

	}
}
