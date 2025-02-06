/*
Problem Statement :

Given an binary sorted metrix N*N find the row row with maximum number of 1's.

Approch : Bruteforce Approch
*/

import java.util.Scanner;

public class rowWithMaximumNumberof1s {
    public static void findMaximumNumberOfOne(int [][] metrix) {
		int maxCountOf=0;
		int rowWithMaximumOne = 0;
		for(int i = 0; i<metrix.length; i++) {
			int currentCount = 0;
			for(int j = 0; j<metrix[0].length; j++) {
				if(metrix[i][j] == 1 ) {
					currentCount++;
					if(currentCount > maxCountOf) {
						maxCountOf = currentCount;
						rowWithMaximumOne = i;
					}

				}
			}
		}
		System.out.println("Column with maximum one "+rowWithMaximumOne);
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

		findMaximumNumberOfOne(metrix);
	}
}
