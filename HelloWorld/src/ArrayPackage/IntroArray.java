package ArrayPackage;

public class IntroArray {

	int arr[];
	int arr1[] = new int[20];
	int[] arr2 = new int[]{1,2,3,4,5};
	int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	
	public void print_array(int a[]) {
		for(int i:a) {
			System.out.println("i = "+i);
		}
	}
}
