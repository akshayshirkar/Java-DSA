public class reverseArrayKelementss {
    public static void reverseArray(int start, int end, int array []){
        while(start <= end ){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for(int i = 0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3,4,6,7};
		int k = 2;
		int start = 0;
		int end = arr.length-1;
		// Reverse entire array
		reverseArray(start,end,arr);
		
		// Reverse first k elements
		reverseArray(start,k -1,arr);
		
		// Reverse n-k elements
		reverseArray(end-k-1,end,arr);
	}
}
