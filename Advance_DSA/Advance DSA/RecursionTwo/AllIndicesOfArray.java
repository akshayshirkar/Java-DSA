import java.util.ArrayList;
import java.util.List;

public class AllIndicesOfArray {
    public int[] allIndices(int[] A, int B) {
        List<Integer> indicesList = new ArrayList<>();
        findIndicesRecursive(A, B, 0, indicesList);
    
        // Convert List<Integer> to int[]
        int[] indices = new int[indicesList.size()];
        for (int i = 0; i < indicesList.size(); i++) {
            indices[i] = indicesList.get(i);
        }
        return indices;
    }
    
    private static void findIndicesRecursive(int[] A, int B, int index, List<Integer> indices) {
        if (index == A.length) {
            return;
        }
        if (A[index] == B) {
            indices.add(index);
        }
        findIndicesRecursive(A, B, index + 1, indices);
    }
}
