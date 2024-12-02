import java.util.Scanner;

public class mat_printprinciplediagonal {
    //this code is to print print principle diagonal element
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[3][3];
		// Enter the element in 2d array
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// print the element for 2d array
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
		//print the principle diagonal
		for(int i = 0; i<arr.length; i++) {
			System.out.println(" principle diagonal is "+arr[i][i]);
		}
	}
}
