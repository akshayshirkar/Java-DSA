public class findlargestandsmallestelement {
    public class Main
{
    public static void findlargestandsmallestelement(int arr []){
        int smallest = Integer.MAX_VALUE;
        int current_smallest = 0;
        int largest = Integer.MIN_VALUE;
        int currentLargest = 0;
        if(arr.length < 2){
            System.out.println("There is no smallest element exist");
            
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                currentLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Second largest element is "+currentLargest);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < smallest){
                current_smallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < current_smallest && arr[i] != smallest ){
                current_smallest = arr[i];
            }
        }
        System.out.println("Second smallest element is "+current_smallest);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3,4};
		findlargestandsmallestelement(arr);
	}
}
}
