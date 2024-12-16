public class isArraySorted {
    public class Main
{
	public static void isArraySorted(int [] arr) {
		boolean isSorted = false;
		int n = arr.length;
		if(n == 1){
		    isSorted = true;
		}
		for(int i = 0 ; i < n-1 ; i++) {
			if(arr[i] < arr[i + 1]) {
				isSorted = true;
			}else{
			    isSorted = false;
			}
		}
		if(isSorted == true) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1};
		isArraySorted(arr);
	}
}
}
