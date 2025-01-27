import java.util.ArrayList;

public class ContinuousSumQuery {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> result = new ArrayList();
        int [] arr = new int [A];
        for(ArrayList<Integer> sublist : B){
            int i = sublist.get(0) - 1;
            int j = sublist.get(1) - 1;
            int value = sublist.get(2);
            arr[i] = arr[i] +  value;
            if(j < arr.length - 1){
                arr[j+1] = arr[j+1]-value;
            }
        }
        result.add(arr[0]);
        for(int k = 1;k<arr.length;k++){
            arr[k] += arr[k-1];
            result.add(arr[k]);
        }
        return result;
    }
}
