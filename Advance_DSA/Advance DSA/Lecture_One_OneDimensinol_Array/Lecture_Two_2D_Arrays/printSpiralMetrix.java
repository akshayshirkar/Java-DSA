public class printSpiralMetrix {
    public static void printSpiralMetrix1(int [][] matrix) {
		// find the rowas and columns
		int rows = matrix.length;
		int columns = matrix[0].length;
		int top = 0;
		int left = 0;
		int bottom = rows - 1;
		int right = columns - 1;


		while(top <= bottom && left <= right ) {
			// print the top to right elements
			for(int i = left; i <= right; i++) {
				System.out.print(" "+matrix[top][i]);
			}
			System.out.println();
			top++;

			// print the elements top to bottom
			for(int i = top; i<=bottom; i++) {
				System.out.print(" "+matrix[i][right]);
			}
			System.out.println();
			right--;

			// For moving right to left.
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(" "+matrix[bottom][i]);
				}
				System.out.println();
				bottom--;
			}
			// For moving bottom to top.
			if (left <= right) {
				for (int i = bottom; i >= top; i--){
				    System.out.print(" "+matrix[i][left]);
				}
				System.out.println();
				left++;
			}
		}

	}
}
