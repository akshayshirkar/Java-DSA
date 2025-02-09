import java.util.Scanner;

public class printSumOfAllTheSubarray {
    public static void printSumOfTheSubarray(int [][] mat,int n,int m) {
		int sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				int ijSubmetricisPart = (i+1)*(j+1)*(n-i)*(m-j);
				int contribution = ijSubmetricisPart * mat[i][j];
				sum+= contribution;
			}

		}
		System.out.println("The sum is "+sum);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");

		// Generating the matrix
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Rows
		int m = sc.nextInt(); // Columns

		int[][] mat = new int[n][m];

		// Taking input for matrix
		for (int i = 0; i < n; i++) { // b Iterate over rows
			for (int j = 0; j < m; j++) { // b Iterate over columns
				mat[i][j] = sc.nextInt();
			}
		}

		// Printing the matrix
		System.out.println("Matrix Output:");
		for (int i = 0; i < n; i++) { // b Iterate over rows
			for (int j = 0; j < m; j++) { // b Iterate over columns
				System.out.print(" " + mat[i][j]);
			}
			System.out.println(); // b Move to the next line after each row
		}
		printSumOfTheSubarray(mat,n,m);
	}
}
