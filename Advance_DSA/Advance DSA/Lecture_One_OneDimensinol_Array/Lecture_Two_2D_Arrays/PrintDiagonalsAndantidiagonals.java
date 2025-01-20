/*
Question :

Given 2d metrix N*M print the principle diagonals and antidiagonals

Example :

1 2 3
4 5 6
7 8 9

*/
public class PrintDiagonalsAndantidiagonals {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		// ptint principle diagonals
		for(int i = 0; i<matrix.length; i++) {
			System.out.println(matrix[i][i]);
		}

		// print antidiagonals

		int i = 0;
		int j = matrix.length-1;
		while(i < matrix.length && j >= 0) {
			System.out.println(matrix[i][j]);
			i++;
			j--;
		}
	}
}
