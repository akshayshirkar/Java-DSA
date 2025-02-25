public class printNToOneNumberBacktrack {
    public static void printNuminReverseOrder(int i,int n){
        // base condition
        if(i > n){
            return;
        }
        printNuminReverseOrder(i+1,n);
        System.out.println(i);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i =1;
		int n = 5;
		printNuminReverseOrder(i,n);
	}    
}
