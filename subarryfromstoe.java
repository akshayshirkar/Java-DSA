public class subarryfromstoe {
    // this code is to print the subarray from start to end
    public static void printsubarry(int [] arr, int start,int end){
        for(int i = start ; i<= end;i++){
            System.out.println(arr[i]);
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int start = 0;
		int end = 2;
		int [] arr = {1,2,3,4,5,6,7};
		printsubarry(arr,start,end);
	}
}
