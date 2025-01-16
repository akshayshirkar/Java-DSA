import java.util.Arrays;

public class findNobelOptimisedApproch {
    public static void nobelelementotimisedapproch(int [] arr){
	    int ans = 0;
	    int countSmaller=0;
	    Arrays.sort(arr);
	    if(arr[0] == 0){
	        ans++;
	    }
	    for(int i=1;i<arr.length;i++ ){
	        if(arr[i] != arr[i-1]){
	            countSmaller = i;
	        }
	        if(arr[i] == countSmaller){
	            ans++;
	        }
	    }
	    System.out.println("Final count is ==>"+ans);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {-10,1,1,2,4,4,4,8,10};
		nobelelementotimisedapproch(arr);
	}
}
