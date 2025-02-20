public class findPower {
    public static int Power(int a, int n){
        if(n == 0){
            return 1;
        }
        // Recursuve relation
        return Power(a,n-1) * a;
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int pow = Power(2,3);
		System.out.println("Pow is "+pow);
	}
}
