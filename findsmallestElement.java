import java.util.Arrays;

public class findsmallestElement {
    public static void smallestElementatb(int [] arr , int b){
        Arrays.sort(arr);
        for(int i = 0;i< arr.length;i++){
            if(b == i+1){
                System.out.println(arr[i]);
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1, 2};
		int b = 2;
		smallestElementatb(arr,b);
	}
}
