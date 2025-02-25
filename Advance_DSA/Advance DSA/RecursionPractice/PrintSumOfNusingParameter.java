
public class PrintSumOfNusingParameter {
    public static void printSum(int i, int sum){
        // base condition
        if(i < 1){
            System.out.println(sum);
            return;
        }
        printSum(i-1,sum + i);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int i = 5;
		int sum = 0;
		printSum(i,sum);
	} 
}
