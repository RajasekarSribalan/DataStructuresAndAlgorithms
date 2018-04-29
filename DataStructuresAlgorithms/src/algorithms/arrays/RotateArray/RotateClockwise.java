package algorithms.arrays.RotateArray;

import java.util.Arrays;

public class RotateClockwise {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int rotate = 15;

		arr = rotateClockWise(arr, n, rotate);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * Rotate Array clockwise by one
	 * 
	 * @param arr
	 * @param n
	 * @param rotate
	 * @return
	 */
	private static int[] rotateClockWise(int[] arr, int n, int rotate) {

		for (int j = 0; j < rotate; j++) {
			int lastValue = arr[n - 1];
			int temp = arr[0];
			for (int i = 1; i < n; i++) {
				int data = arr[i];
				arr[i] = temp;
				temp = data;
			}
			arr[0] = lastValue;
		}
		return arr;

	}
}
