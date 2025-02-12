public class NumberOf1bit {
    public int numSetBits(int A) {
        int count = 0;
        while (A != 0) {
            A = A & (A - 1); // Clears the lowest set bit
            count++;
        }
        return count;
    }
}
