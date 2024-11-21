public class prefixsumoptimised2 {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {2,5,-1,7,1};
		int n = arr.length;
		int [] pf = new int [n];
		pf[0] = arr[0];
		for(int i = 1; i<n; i++) {
			pf[i] = pf[i-1] + arr[i];
		}
		for(int k = 0; k<n; k++) {
			System.out.println(pf[k]);

		}
	}
}
