public class sumofklength {
    public static void findsumofklengtharray(int [] arr, int k){
        // find the prefix sum for entire Array
        int n = arr.length;
        int [] pf = new int [n];
        int finalSum = Integer.MIN_VALUE;
        pf[0] = arr[0];
        for(int i = 1;i<n;i++){
            pf[i] = pf[i-1] + arr[i];
        }
        for(int Start=0;Start<=n-k;Start++){
            int currentSum=0;
            int end = Start+k-1;
            if(Start == 0){
                currentSum = pf[end];
            }else{
                currentSum = pf[end] - pf[Start-1];
            }
            
            finalSum = (currentSum > finalSum) ?  currentSum : finalSum;
        }
        System.out.println(finalSum);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3,4,5,6,7,8};
		int k = 2;
		findsumofklengtharray(arr,k);
	}
}
