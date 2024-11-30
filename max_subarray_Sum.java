public class max_subarray_Sum {
    // this code is written using sliding window
    public static void max_subarray(int[] A, int B, int C){
        // find 1st subarray
        int n = A.length;
        int maxsum = 0;
        for(int i = 0;i<B;i++){
            maxsum+=A[i];
        }
        if(maxsum == C){
            System.out.println(1);
            
        }
        // find rest subarray
        for(int start = B;start<n;start++){
            maxsum = maxsum - A[start-B] + A[start];
            System.out.println(maxsum);
            if(maxsum == C){
            System.out.println(1);
        }
        }
        System.out.println(0);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] A = {6,3,3,6,7,8,7,3,7};
		int B = 2;
		int C = 10;
		max_subarray(A,B,C);
	}
}
