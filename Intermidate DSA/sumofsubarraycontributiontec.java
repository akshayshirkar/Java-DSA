public class sumofsubarraycontributiontec {
    public static void totalsubarraysum(int [] arr){
        int sum = 0;
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i]*(i+1)*(n-i);
        }
        System.out.println(sum);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {10,20,30};
		totalsubarraysum(arr);
	}
}
