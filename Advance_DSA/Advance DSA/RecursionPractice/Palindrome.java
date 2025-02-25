public class Palindrome {
    public static boolean isPalandrom(String str, int n, int i){
        // base condition
        if(i >= n/2){
            return true;
        }
        if(str.charAt(i)!= str.charAt(n-1-i)){
            return false;
        }
        return isPalandrom(str,n,i+1);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "1214";
		int n = str.length();
		int i = 0;
		boolean palandrom = isPalandrom(str,n,i);
		System.out.println("palandrom "+palandrom);
	}
}
