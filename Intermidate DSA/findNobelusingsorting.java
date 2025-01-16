import java.util.Arrays;

public class findNobelusingsorting {
    public static void findnobelelementusingsorting(int [] arr){
	    int finalanswer=0;
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++){
	        if(arr[i] == i){
	           finalanswer++; 
	        }
	    }
	    System.out.println("Final answer is ==>"+finalanswer);
	    
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {-3,0,2,5};
		findnobelelementusingsorting(arr);
	}
}
