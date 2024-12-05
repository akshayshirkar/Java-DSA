public class NobelElement {
    public static void findNobelElement(int [] arr){
	    int finalans = 0;
	    for(int i=0;i<arr.length;i++){
	        int count = 0;
	        for(int j = 0;j<arr.length;j++){
	            if(arr[j] < arr[i]){
	                count++;
	            }
	        }
	        if(arr[i] == count){
	            finalans++;
	        }
	    }
	    System.out.println("Final ans is ==>"+finalans);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {-3,0,2,5};
		findNobelElement(arr);
	}
}
