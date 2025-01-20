public class printAntidiagonalsfromLeft {
    public static void printAntiDiagonls(int [][] mat, int i,int j){
        while(i < mat.length  && j >= 0){
            System.out.print(mat[i][j]);
            i++;
            j--;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] matrix = {
			{1, 2, 3,4},
			{5, 6,7,8},
			{9,10,11,12}
		};
		
		int i = 0;
		for(int j = 0;j<=matrix.length;j++){
		    printAntiDiagonls(matrix,i,j);
		}
		int N = matrix[0].length;
		int k = matrix.length;
		
	    for(int j = 1;j<N-1;j++){
	        printAntiDiagonls(matrix,j,k);
	    }
		
	}
}
