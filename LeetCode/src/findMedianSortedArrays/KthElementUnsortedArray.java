package findMedianSortedArrays;

public class KthElementUnsortedArray {

	static int kthSmallest(int arr[], int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {
			int pos = randomPartition(arr, l, r);

			if (pos - l == k - 1)
				return arr[pos];
			if (pos - l > k - 1) // If position is more, recur for left subarray
				return kthSmallest(arr, l, pos - 1, k);

			return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
		}

		return Integer.MAX_VALUE;
	}

	private static void swap(int[] arr, int largest, int index) {
		int temp = arr[index];
		arr[index] = arr[largest];
		arr[largest] = temp;

	}

	// Standard partition process of QuickSort(). It considers the last
	// element as pivot and moves all smaller element to left of it
	// and greater elements to right
	static int partition(int arr[], int l, int r) {
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, r);
		return i;
	}

	static int randomPartition(int arr[], int l, int r) {
		int n = r - l + 1;
		int pivot = (l + (r - l) / 2);
		swap(arr, l + pivot, r);
		return partition(arr, l, r);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, 5, 7, 4, 19, 26 };
		int k = 3;
		System.out.println("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
	}

}
