import java.util.ArrayList;

public class rotatearraytoright {
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A,int s,int e){
        for(int val : A){
            while(s<e){
                int temp = A.get(s);
                A.set(s,A.get(e));
                A.set(e,temp);
                s++;
                e--;
            }
        }
        return A;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        B = B % n;

        // reverse the entire ArrayList
        rotateArray(A,0,n-1);

        // reverse fisrt b element
        rotateArray(A,0,B-1);

        // reverse b t0 n element

        rotateArray(A,B,n-1);

        return A;
    }
}
