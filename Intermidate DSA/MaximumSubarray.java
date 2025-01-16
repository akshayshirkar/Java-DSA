public class MaximumSubarray {
    public int maxSubarray(int A, int B, int[] C) {
        int sum = 0;
        int maxsum = 0;
        for(int s = 0;s<A;s++){//start index
            sum=0;
            for(int e = s;e<A;e++){//end index
                sum +=C[e];
                if(sum>maxsum && sum<=B){
                    maxsum=sum;
                }
            }
        }
        return maxsum;
       
    }
}
