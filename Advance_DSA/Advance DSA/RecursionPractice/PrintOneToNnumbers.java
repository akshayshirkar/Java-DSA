public class PrintOneToNnumbers {
    public static void printNumber(int i, int n){
        // Base condition
        if(i > n){
            return;
        }
        System.out.println(i);
        printNumber(i+1,n);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 20;
		int i = 1;
		printNumber(i,n);
	}
}
