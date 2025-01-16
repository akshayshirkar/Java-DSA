public class sumofsubarrayusingpf {
    public static void subarraysumusingpf(int [] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            int cursum=0;
            for(int j = i ;j<arr.length;j++){
             if(i == 0){
                 cursum+=arr[j];
             }else{
                 cursum+=arr[j] - arr[i -1];
             }   
            }
            sum += cursum;
        }
        System.out.println(sum);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr ={10,20,30};
		int n = arr.length;
		// Follwoing code is to calculate the prefix sum
		int [] pfarray = new int [n];
		pfarray[0] = arr[0];
		for(int i = 1;i<pfarray.length;i++){
		    pfarray[i] = pfarray[i - 1] + arr[i];
		}
		subarraysumusingpf(pfarray);
	}
}
