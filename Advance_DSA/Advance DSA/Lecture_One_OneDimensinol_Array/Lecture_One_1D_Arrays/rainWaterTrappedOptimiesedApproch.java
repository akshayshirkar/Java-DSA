/*
Problem Statement : Given an array height[] of non-negative integers, where each element represents the height of a bar, 
compute how much water it can trap after raining.

*/
public class rainWaterTrappedOptimiesedApproch {
    public int trap(final int[] A){
        int n = A.length;
        int [] prefixMax = new int [n];
        int [] SuffiexMax = new int [n];
        
        // find out the prefixMax
        prefixMax[0] = A[0];
        for(int i = 1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],A[i]);
        }
        
        // find out the suffixMax
        SuffiexMax[n-1] = A[n-1];
        for(int i= n - 2;i>=0;i--){
            SuffiexMax[i] = Math.max(SuffiexMax[i+1],A[i]);
        }
        
        int total_WaterTrapped = 0;
        
        for(int i = 0;i<n;i++){
            total_WaterTrapped+= Math.min(prefixMax[i],SuffiexMax[i]) - A[i];
        }
        return total_WaterTrapped;
    }
}
