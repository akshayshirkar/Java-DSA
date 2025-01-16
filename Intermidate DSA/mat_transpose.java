import java.util.Scanner;

public class mat_transpose {
    public static void transpose(int mat [][]){
        int n = mat.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
            
        }
        
        for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[0].length; j++) {
				System.out.print(" "+mat[i][j]);
			}
			System.out.println();
		}
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		// this code is to take the 2d array as input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int [][] mat = new int [n][m];

		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// following code is to print 2d array
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[0].length; j++) {
				System.out.print(" "+mat[i][j]);
			}
			System.out.println();
		}
		System.out.println(" ");
		transpose(mat);
	}
}
