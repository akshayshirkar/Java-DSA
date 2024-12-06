public class findmaxlengthpalindrom {
    public static boolean mxlenghthPalindrom(char [] charArray, int start,int end){
        int i=start;
        int j=end;
        while(i < j){
           if(charArray[i] != charArray[j]){
               return false;
           }
           i++;
           j--;
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "anamadamspe";
		int maxlength=0;
		char [] charArray =  str.toCharArray();
		for(int i = 0;i<charArray.length;i++){
		    for(int j = i;j<charArray.length;j++){
		        if(mxlenghthPalindrom(charArray,i,j)){
		            if(maxlength > j-i+1){
		                maxlength = maxlength;
		            }else{
		                maxlength = j-i+1;
		            }
		        }
		    }
		}
		System.out.println("maxlength is =>"+maxlength);
	}
}
