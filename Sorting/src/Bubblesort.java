
public class Bubblesort {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 7, 5, 4, 10, 15 };
		sortBubble(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// Bubble sort has worst-case and average complexity both big O n^2, where n
	// is the number of items being sorted. 
	private static void sortBubble(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}
