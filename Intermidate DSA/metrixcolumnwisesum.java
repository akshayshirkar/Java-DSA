import java.util.Scanner;

public class metrixcolumnwisesum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		int [][] arr = new int[3][4];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int j = 0; j<arr[0].length; j++) {
			int sum = 0;
			for(int i = 0; i<arr.length; i++) {
				//System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
			}
			System.out.println("The sum is "+sum);
		}

	}
}
