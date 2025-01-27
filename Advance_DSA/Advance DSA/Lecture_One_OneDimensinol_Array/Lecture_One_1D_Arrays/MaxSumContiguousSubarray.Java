/* Find the maximum sum of contiguous non-empty subarray within an array A of length N.
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> c) {
        int Maxsum = c.get(0);
        int current_Sum = 0;
        for(Integer Cref : c){
                current_Sum += Cref;
                Maxsum = Math.max(Maxsum,current_Sum); 
                if(current_Sum < 0 ){
                   current_Sum = 0;
                }
        }
        return Maxsum;
    }
}
