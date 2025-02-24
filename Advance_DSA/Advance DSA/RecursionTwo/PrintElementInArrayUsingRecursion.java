public class PrintElementInArrayUsingRecursion {
    public void PrintArray(int[] A) {
        printArrayUsingRecursiveFunction(A,0);
        System.out.println();
    }
    public static void printArrayUsingRecursiveFunction(int [] arr,int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        printArrayUsingRecursiveFunction(arr,i+1);
    }
}
