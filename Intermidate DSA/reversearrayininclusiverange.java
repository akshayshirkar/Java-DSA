import java.util.ArrayList;
public class reversearrayininclusiverange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        for(int val : A){
            while(B<C){
                int tmp = A.get(B);
                A.set(B,A.get(C));
                A.set(C,tmp);
                B++;
                C--;
            }
        }
        return A;
    }

}
