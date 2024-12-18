public class moveNONzeroatlast {
    public static void moveNONzeroatlast(int [] arr){
        // this loop is to find the non zero index
        int j = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        // this loop is to swap the element
        for(int  i = j+1;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] =  arr[j];
                arr[j] = temp;
                j++;
            }
        }
        // this loop is to print the array element
        for(int s = 0;s<arr.length;s++){
            System.out.println(arr[s]);
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1, 0, 2, 3, 2};
		moveNONzeroatlast(arr);
	}
}
