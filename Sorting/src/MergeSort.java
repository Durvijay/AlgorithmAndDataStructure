
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 55, 20, 8, 7, 5, 4, 10, 15 };
		sortMerge(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// The constant factors of mergesort are typically not that great though so
	// algorithms with worse complexity can often take less time. The complexity
	// of merge sort is O(nlogn) and NOT O(logn). The divide step computes the
	// midpoint of each of the sub-arrays. Each of this step just takes O(1)
	// time.
	private static void sortMerge(int[] arr, int left, int right) {
		if (right > left) {
			int mid = (left + right) / 2;
			sortMerge(arr, left, mid);
			sortMerge(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}

	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int l = mid - left + 1;
		int r = right - mid;
		int[] L = new int[l];
		int[] R = new int[r];
		for (int i = 0; i < l; i++) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < r; j++) {
			R[j] = arr[mid + 1 + j];
		}
		int i, j, k = 0;
		i = j = 0;
		k = left;
		while (i < l && j < r) {
			if (L[i] <= R[j]) {
				arr[k++] = L[i];
				i++;
			} else {
				arr[k++] = R[j];
				j++;
			}
		}
		while (i < l) {
			arr[k++] = L[i++];
		}
		while (j < r) {
			arr[k++] = R[j++];
		}
	}

}
