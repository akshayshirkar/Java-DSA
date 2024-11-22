public class prefixsumevenindices {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {2,3,1,6,4,5};
		int n = arr.length;
		int [] Pfeven = new int[n];
		Pfeven[0] = arr[0];
		for(int i = 1; i< arr.length;i++){
		    if( i % 2 == 0){
		        Pfeven[i] = Pfeven[i-1]+arr[i];
		    }else{
		         Pfeven[i] = Pfeven[i - 1];
		    }
		}
		for(int i =0;i<n;i++){
		    System.out.println(Pfeven[i]);
		}
	}
}
