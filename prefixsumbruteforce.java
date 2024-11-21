public class prefixsumbruteforce {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {-3,6,2,4,5,2,8,-9,3,1}; 
		int [][] queris = {{4,8},{3,7},{1,3},{0,4},{7,7}};
		// calculate the prefix sum for arr
		int n = arr.length;
		int [] pf = new int [n];
		pf[0] = arr[0];
		for(int i = 1;i<n;i++){
		    pf[i] = pf[i-1]+arr[i];
		}
		for(int i = 0;i<queris.length;i++){
		    int l = queris[i][0];
		    int r = queris[i][1];
		    int sum = 0;
		    if(l==0){
		        sum = pf[r];
		    }else{
		        sum = pf[r]-pf[l-1];
		    }
		    System.out.println("The sum is "+sum);
		}
	}
}
