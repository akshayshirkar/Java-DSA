import java.util.Scanner;
/*
Problem : gievn the row wise and column wise sorted metrix find the k is presnt or not.
Approch : bruteForce
*/
public class Findk {
    public static void findK(int mat[][],int k) {
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] == k) {
					System.out.println("K is present");
				} else {
					System.out.println("K is not present");
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner sc = new Scanner(System.in);
		int Col = sc.nextInt();
		int Row = sc.nextInt();

		int [][] metrix = new int[Row][Col];
		int k = 25;

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
		findK(metrix,k);

	}
}
