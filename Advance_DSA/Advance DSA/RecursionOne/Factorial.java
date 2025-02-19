/*
Problem :

Gievn 'N' find the factoril using recursion.

*/

public class Factorial {
    public static int findfactorial(int n){
        // Base case 
        if(n == 1){
           return 1;
        }
       // asumption that out solution will work for the smaller Problem
        return (n *(findfactorial(n-1)));
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int fact = findfactorial(5);
		System.out.println("fact is "+fact);
	}
}
