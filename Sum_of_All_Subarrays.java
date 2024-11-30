public class Sum_of_All_Subarrays {
    // this problem is resolved using contribution technique
    public long subarraySum(int[] A) {
        long total_sum = 0L;
        int n = A.length;
        for(int i = 0;i<n;i++){
            total_sum += (long) A[i] * (i+1)*(n-i);
        }
        return total_sum;
    }
}
