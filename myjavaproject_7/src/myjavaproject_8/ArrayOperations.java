package myjavaproject_8;

public class ArrayOperations {
	public static void main(String args[]) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = arr.length - 1; i >= 0; i--) {
			int ele = arr[i];
			System.out.println(ele);
		}
	}

}
