public class fundsumofquires {
    public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {-3,6,2,4,5,2,8,-9,3,1}; 
		int [][] queris = {{4,8},{3,7},{1,3},{0,4},{7,7}};
		int l;
		int r;
		for(int i = 0;i<queris.length;i++){
		    l=queris[i][0];
		    r=queris[i][1];
		    int sum = 0;
		    while(l<=r){
		        sum += arr[l];
		        l++;
		    }
		    System.out.println("Sum is "+sum);
		}
	}
    
}