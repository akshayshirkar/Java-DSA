public class rotateArrayLeft {
    public class Main
{
	public static void rotateArrayLeft(int [] arr) {
		int n = arr.length;
		int temp = arr[0];
		for(int i = 0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;

		for(int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int [] arr = {1,2,3};
		rotateArrayLeft(arr);
	}
}
}
