public class linierSearch {
    public static void linierSearch( int [] arr, int k){
        int presentAtIndex = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == k){
                presentAtIndex = i;
            }
        }
        if(presentAtIndex != -1){
            System.out.println("Element is present at "+presentAtIndex);
        }else{
            System.out.println("Element is not present at any index");
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3,4,5};
		int k = 2;
		linierSearch(arr,k);
	}
}
