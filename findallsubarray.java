public class findallsubarray {
    // this code is to print the entire sub array of the array
    public static void prrintSubArray(int [] arr, int start,int end){
        for(int k = start;k<=end;k++){
            System.out.print(arr[k]);
        }
        System.out.println("");
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3};
		for(int i = 0;i<arr.length;i++){
		    for(int j = 0;j<arr.length;j++){
		        prrintSubArray(arr,i,j);
		    }
		}
	}
}