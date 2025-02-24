public class maxElementinArayUsingReusrsion {
    public int getMax(int[] A) {
        return maxElement(A,0);
    }
    public int maxElement(int [] A,int i){
        if(i == A.length){
            return Integer.MIN_VALUE;
        }
        return Math.max(maxElement(A,i+1),A[i]);
    }
}
