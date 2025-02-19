/*
problem : print 'N' numbers in incresing order till 1;

*/

public class printNumbersIncorder {
    public static void printNumbersIncreasingorder(int n){
        // Break condition
        if(n == 0){
            return;
        }else if(n < 0){
            return;
        }
        // recursive relation;
       printNumbersIncreasingorder(n-1);
       System.out.println("Number is "+n);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		printNumbersIncreasingorder(7);
	}
}
