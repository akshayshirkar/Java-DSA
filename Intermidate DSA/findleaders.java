import java.util.ArrayList;
import java.util.List;

public class findleaders {
        public static void findleaders(int [] arr){
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1;i >= 0;i--){
            if(arr[i]  > max){
                max = arr[i];
                leaders.add(arr[i]);
            }
        }
        for(Integer values : leaders){
            System.out.println(values);
            
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr ={16, 17, 4, 3, 5, 2};
		findleaders(arr);
	}
}
