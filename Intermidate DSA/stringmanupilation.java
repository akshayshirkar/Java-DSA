public class stringmanupilation {
    public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "Test";
		char [] chararray = str.toCharArray();
		for(int i = 0;i<chararray.length;i++){
		    if(chararray[i] >= 'A' && chararray[i] <= 'Z'){
		        chararray[i] = (char)(chararray[i] + 32);
		    }else{
		        chararray[i] = (char)(chararray[i] - 32);
		    }
		}
		System.out.println(String.valueOf(chararray));
	}
}
