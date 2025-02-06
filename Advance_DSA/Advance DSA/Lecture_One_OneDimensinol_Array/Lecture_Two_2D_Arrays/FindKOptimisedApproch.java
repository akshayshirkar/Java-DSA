import java.util.Scanner;

public class FindKOptimisedApproch {
    public static void findK(int [][] metrix, int k ){
        int i = 0;
        int j = metrix[0].length - 1;
        while(i < metrix.length && j >= 0){
            if(metrix[i][j] > k){
                j--;
            }else if(metrix[i][j]  < k ){
                i++;
            }else{
                System.out.println("K is present");
                break;
            }
            System.out.println("K is not present");
            break;
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
		findK(metrix,k);
	}
}
