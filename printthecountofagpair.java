public class printthecountofagpair {
    // this is using carry forward technique
    public static void main(String[] args) {
		System.out.println("Hello World");
		int ans = 0;
		int countofa = 0;
		int finalcountofa = 0;
		String str = "bcaggaag";
		for(int i = 0;i<str.length();i++){
		    if(str.charAt(i) == 'a'){
		        countofa++;
		    }
		    else if(str.charAt(i) == 'g'){
		        ans += countofa;
		    }
		}
		System.out.println("The count of ag pair is "+ans);
	}
}
