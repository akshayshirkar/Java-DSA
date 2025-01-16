public class printallsubarray {
    // this code is using bruteforec approch
    public static void printsumofallsubaray(int [] arr){
        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
              for(int k = i ; k <= j; k++){
                  sum += arr[k];
              }  
            }
        }
        System.out.println(sum);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {10,20,30};
		printsumofallsubaray(arr);
	}
}
