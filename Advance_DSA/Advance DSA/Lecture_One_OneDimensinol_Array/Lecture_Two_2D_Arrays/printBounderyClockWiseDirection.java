/*
Problem : Given the metrix N*N print the boundry in clockwise direction
*/

import java.util.Scanner;

public class printBounderyClockWiseDirection {
    public static void printBoundryClockWiseDirection(int [][]matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Print top row (left to right)
		for (int j = 0; j < cols; j++) {
			System.out.print(matrix[0][j] + " ");
		}
		System.out.println("");

		// Print rightmost column (top to bottom)
		for (int i = 1; i < rows; i++) {
			System.out.print(matrix[i][cols - 1] + " ");
		}
		System.out.println("");

		// Print bottom row (right to left) if there's more than one row
		if (rows > 1) {
			for (int j = cols - 2; j >= 0; j--) {
				System.out.print(matrix[rows - 1][j] + " ");
			}
		}
		
		System.out.println("");
		// Print leftmost column (bottom to top) if there's more than one column
		if (cols > 1) {
			for (int i = rows - 2; i > 0; i--) {
				System.out.print(matrix[i][0] + " ");
			}
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Col = sc.nextInt();
		int Row = sc.nextInt();

		int [][] metrix = new int[Row][Col];
		int k = 1;

		for(int i = 0; i<Row; i++) {
			for(int j = 0 ; j <Col; j++) {
				metrix[i][j] = sc.nextInt();
			}
		}

		// This code is to print the metrix

		for(int i = 0; i<Row; i++) {
			for(int j = 0 ; j <Col; j++) {
				System.out.print(" "+metrix[i][j]);
			}
			System.out.println();
		}
		printBoundryClockWiseDirection(metrix);
	}
}
