public class prefixsumoddindices {
    public static void main(String[] args) {
	    int [] arr = {2,3,1,6,4,5};
	    int n = arr.length;
	    int [] pfodd = new int [n];
		System.out.println("Hello World");
		pfodd[0] = 0;
		for(int i = 1;i<n;i++){
		    if( i % 2 !=0){
		        pfodd[i] = pfodd[i-1] + arr[i];
		    }else{
		        pfodd[i] = pfodd[i-1];
		    }
		}
		for(int j = 0;j<n;j++){
		    System.out.println(pfodd[j]);
		}
	}
}
