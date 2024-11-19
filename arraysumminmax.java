import java.util.ArrayList;
public class arraysumminmax {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int val : A){
            if(val > max ){
                max = val;
            }
            if(val < min){
               min = val; 
            }
        }
        return max + min;
    }
}
