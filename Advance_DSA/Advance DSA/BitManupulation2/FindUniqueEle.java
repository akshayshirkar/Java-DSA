public class FindUniqueEle {
    public static void findUniqeElements(int [] A) {
		int ans = 0;
		for(int i =0; i<32; i++) {
			int cunt = 0;
			for(int j =0; j<A.length; j++) {
				if((A[j]&(1<<i)) > 0) { // this is to check if the bit is set
					cunt++;
				}
			}
			if(cunt % 2 != 0) {
				ans |= (1 << i);
			}
		}
		System.out.println("Unique element is "+ans);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,1,2,3};
		findUniqeElements(arr);
	}
}

