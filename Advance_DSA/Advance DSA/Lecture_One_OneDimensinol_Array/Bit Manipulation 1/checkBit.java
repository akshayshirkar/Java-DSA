public class checkBit {
    public int solve(int A, int B) {
        if((A & (1 << B))>0){
            return 1;
        }
        return 0;
    }    
}
