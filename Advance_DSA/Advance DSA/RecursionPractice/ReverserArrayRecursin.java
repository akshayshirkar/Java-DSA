public class ReverserArrayRecursin {
    public static void reverseArrayUsingRecursion(int l, int r, int [] arr){
        if(l >= r){
            return;
        }
        int tmp = arr[r];
        arr[r] = arr[l];
        arr[l] = tmp;   
        reverseArrayUsingRecursion(l+1,r-1,arr);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3,4};
		int n = arr.length;
		reverseArrayUsingRecursion(0,n-1,arr);
	}
}
