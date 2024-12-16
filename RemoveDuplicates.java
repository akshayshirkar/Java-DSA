public class RemoveDuplicates {
    public class Main
    {
        public static void RemoveDuplicates(int [] arr) {
            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    i++;
                    arr[i] = arr[j];
                }
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(arr[k] + " ");
            }
        }
        public static void main(String[] args) {
            System.out.println("Hello World");
            int [] arr = {1,3,3};
            RemoveDuplicates(arr);
        }
    } 
}
