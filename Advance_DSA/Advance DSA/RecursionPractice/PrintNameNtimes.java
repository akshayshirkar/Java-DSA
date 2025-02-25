public class PrintNameNtimes {
    public static void printName(int i,int n){
        // base condition
        if(i > n){
            return;
        }
        System.out.println("Akshay");
        printName(i+1,n);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		printName(0,3);
	}    
}
