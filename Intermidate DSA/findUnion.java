import java.util.HashSet;

public class findUnion {
    public static void findUnion(int [] arr1, int [] arr2){
        HashSet<Integer> elements = new HashSet();
        int sizeFinalArray = elements.size();
        for(int i = 0;i<arr1.length;i++){
            elements.add(arr1[i]);
        }
        for(int j =0;j<arr2.length;j++){
            elements.add(arr2[j]);
        }
        int i = 0;
        for(Integer val : elements){
            System.out.println(val);
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2={4,5,6,7,8,9};
		findUnion(arr1,arr2);
	}
}
