/*
Question : 

Given an metrix of N*M print row wise sum.

1  2  3  4
5  6  7  8
9 10 11 12

O/P = [10,24,42]
 
*/
public class rowwisesum {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        for(int i = 0;i<matrix.length;i++){
            int sum = 0;
            for(int j = 0;j<matrix[i].length;j++){
                sum += matrix[i][j];
            }
            System.out.println("sum is >> "+sum);
        }
	}
}
