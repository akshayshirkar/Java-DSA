import java.util.Scanner;

public class mat_printlefttorightdiagonalelemnt {
    public static void printantidiagonals(int [][] mat, int i, int j){
        int n = mat.length;
        while(i < n && j >= 0){
            System.out.print(" "+mat[i][j]);
            i++;
            j--;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		// this code is to take the 2d array as input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] mat = new int [n][m];
		
		for(int i = 0;i<mat.length;i++){
		    for(int j = 0; j<mat[0].length;j++){
		        mat[i][j] = sc.nextInt();
		    }
		}
		
		// following code is to print 2d array
		for(int i = 0;i<mat.length;i++){
		    for(int j = 0; j<mat[0].length;j++){
		        System.out.print(" "+mat[i][j]);
		    }
		    System.out.println();
		}
		
		
		// this code is to print the antidiagonals
		int i = 0;
		for(int j = 0 ; j<mat.length;j++){
		    printantidiagonals(mat,i,j);
		}
		
		int j = mat.length - 1 ;
		for(int k = 1;k <= mat[0].length-1;k++){
		    printantidiagonals(mat,k,j);
		}
	}
}
