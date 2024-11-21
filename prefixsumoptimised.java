public class prefixsumoptimised {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {2,5,-1,7,1};
		int n = arr.length;
		int [] pf = new int [n];
		for(int i = 0;i<n;i++){
		    int sum = 0;
		    int j = 0;
		    while(j<=i){
		        sum+=arr[j];
		        j++;
		        pf[i] = sum;
		    }
		}
		for(int k = 0;k<n;k++){
		    System.out.println(pf[k]);
		    
		}
	}
}
