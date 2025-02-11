public class FirstMissingInteger {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        // this for loop is to make the swap
        for(int i = 0;i<n;i++){
            if(A[i] != i+1){
                while(A[i] > 0 && A[i] <= n && A[i] != A[A[i] -1]){
                    int temp = A[i];
                    A[i] = A[temp -1];
                    A[temp-1] = temp;
                }
            }
        }
        // this for loop is to check the missing element
        for(int i =0;i<n;i++){
            if(A[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
