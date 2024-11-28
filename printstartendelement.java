public class printstartendelement {
    public static void printallstartendelement(int [] arr, int k){
	    for(int i = 0;i<=arr.length-k;i++){
	        int end = i + k-1;
	        System.out.println("Start element is "+i);
	        System.out.println("end element is "+end);
	    }
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3,4,5,6,7,8};
		int k = 2;
		printallstartendelement(arr,k);
	}
}
