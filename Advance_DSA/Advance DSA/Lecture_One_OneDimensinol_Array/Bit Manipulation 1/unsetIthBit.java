public class unsetIthBit {
    public int solve(int A, int B) {
        if((A>>B & 1)==1){
            return (A^(1<<B));
        }
        return A;
    }    
}
