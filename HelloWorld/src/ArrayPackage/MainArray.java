package ArrayPackage;

import java.util.Arrays;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {10,30,3,40,55};
		IntroArray ia = new IntroArray();
		//ia.print_array(arr);
		
		MultiDimensionalArray mda = new MultiDimensionalArray();
		mda.print_2d();
		mda.print_3d();
		mda.arr_Fill();
		
		Arrays.sort(arr);
		
		System.out.printf("\narr[] : %s", 
                Arrays.toString(arr)); 

	}

}
