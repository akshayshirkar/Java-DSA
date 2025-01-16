import java.util.ArrayList;
import java.util.HashSet;

public class arraygoodpair {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> seen = new HashSet<>();
        for(Integer num : A){
            int target = B-num;
            if(seen.contains(target)){
                return 1;
            }
            seen.add(num);
        }
        return 0;
    }
}
