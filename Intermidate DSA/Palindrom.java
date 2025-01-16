public class Palindrom {
    public static void isPalindrom(char [] charArray){
        int i = 0;
        int j = charArray.length-1;
        while(i < j){
           if(charArray[i] != charArray[j]){
               System.out.println("String is not palindrom");
               break;
           }else{ 
                System.out.println("String is palindrom");
           }
           i++;
           j--;
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "madamw";
		char [] charArray =  str.toCharArray();
		isPalindrom(charArray);
	}
}
