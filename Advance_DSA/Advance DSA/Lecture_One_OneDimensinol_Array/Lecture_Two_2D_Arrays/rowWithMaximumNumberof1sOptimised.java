/*
Problem Statement :

Given an binary sorted metrix N*N find the row row with maximum number of 1's.

Approch : Optimised
*/

import java.util.Scanner;

public class rowWithMaximumNumberof1sOptimised {
     public static void findRowWithMaximumNumberOfOne(int [][] metrix ){
        int i = 0; 
        int j = metrix[0].length-1;
        int ans = 0;
        while(i < metrix.length && j >= 0){
            if(metrix[i][j] == 0){
                i++;
            }else{
                j--;
                ans = i;
            }
        }
        System.out.println("Ans is "+ans);
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
		findRowWithMaximumNumberOfOne(metrix);
	}
}
