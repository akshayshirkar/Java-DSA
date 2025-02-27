public class FibonachiSeries {
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int number = fib(1);
		System.out.println(number);
	}
}
