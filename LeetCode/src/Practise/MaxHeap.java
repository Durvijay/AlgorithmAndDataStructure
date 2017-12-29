package Practise;

public class MaxHeap {
	static int[] arr;

	public static void main(String[] args) {
		arr = new int[] { 1, 23, 12, 9, 30, 2, 50 };
		int k = 3;
		printArr();
		buildMaxHeap();
		printArr();
		extractMax();
		printArr();
		extractMax();
		System.out.println("Max :"+extractMax());
		printArr();

	}

	private static int extractMax() {
		if(arr.length==0) return -1;
		int max= arr[0];
		arr[0]=arr[arr.length-1];
		maxHeapify(0);
		return max;
	}

	private static void printArr() {
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}

	private static void buildMaxHeap() {
		int parent = arr.length / 2 - 1;
		for (int i = parent; i >= 0; i--) {
			maxHeapify(i);
		}

	}

	public static void maxHeapify(int index) {

		int largest = index;
		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;
		
		if (leftIndex < arr.length && arr[index] < arr[leftIndex]) {
			largest = leftIndex;
		}
		if (rightIndex < arr.length && arr[largest] < arr[rightIndex]) {
			largest = rightIndex;
		}

		if (largest != index) {
			swap(index, largest);
			maxHeapify(largest);
		}
	}

	
	private static void swap(int largest, int index) {
		int temp = arr[index];
		arr[index] = arr[largest];
		arr[largest] = temp;

	}

}
