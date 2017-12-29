
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 7, 5, 4, 10, 15 };
		sortInsertion(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// If the inversion count is O(n), then the time complexity of insertion
	// sort is O(n). In worst case, there can be n*(n-1)/2 inversions. The worst
	// case occurs when the array is sorted in reverse order. So the worst case
	// time complexity of insertion sort is O(n2).
	private static void sortInsertion(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
