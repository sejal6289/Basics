package ArrayPackage;

import java.util.Arrays;

public class MultiDimensionalArray {
	
	//2d array
	
	int arr_2d[][] = { {1,2,3},{4,5,6},{7,8,9,} };
	
	int arr_3d[][][] = { {{1,11,111},{2,22,222},{3,33,333}},{{4,44,444},{5,55,555},{6,66,666}},{{7,77,777},{8,88,888},{9,99,999}} };
	
	public void print_2d() {
		for(int[] i:arr_2d) {
			for (int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public void print_3d() {
		for(int[][] i:arr_3d) {
			for (int j[]: i) {
				for (int k: j) {
					System.out.print(k + " ");
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}
	
	public void arr_Fill() {
		int arr[] = new int[5];
		Arrays.fill(arr,101);
		for (int j: arr) {
			System.out.print(j + " ");
		}
		
	}

}
