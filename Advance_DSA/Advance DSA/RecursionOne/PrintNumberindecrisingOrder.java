/*
problem : print 'N' numbers in decrising order till 1;

*/

public class PrintNumberindecrisingOrder {
    public static void printNumberIndecendingOrder(int n){
        // base condition
        if(n == 0){
            return;
        }else if(n < 0){
            return;
        }
        // Main logic
        System.out.println("number is "+n);
        printNumberIndecendingOrder(n -1);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		printNumberIndecendingOrder(6);
	}
}
