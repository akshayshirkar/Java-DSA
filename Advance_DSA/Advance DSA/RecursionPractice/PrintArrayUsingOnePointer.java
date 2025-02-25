public class PrintArrayUsingOnePointer {
    public static void printArrayOnePointer(int [] arr, int n, int i){
        // base condition
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-1-i];
        arr[n-1-i] = temp;
        printArrayOnePointer(arr, n,i+1);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3,4,5,6};
		int n = arr.length;
		int i = 0;
		printArrayOnePointer(arr,n,i);
		for(int j = 0;j<n;j++){
		    System.out.println(arr[j]);
		}
		
	}
}
