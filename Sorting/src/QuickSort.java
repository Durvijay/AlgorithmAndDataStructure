
public class QuickSort {

	public static void main(String[] args) {
		int [] arr=new int[]{8,7,5,4,10,15};
		sortQuick(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void sortQuick(int[] arr, int left, int right) {
		int index=partition(arr,left,right);
		if(left<index-1){
			sortQuick(arr, left, index-1);
		}if(index<right){
			sortQuick(arr, index, right);
		}
		
		
	}

	private static int partition(int[] arr, int left, int right) {
		int pivot=arr[(left+right)/2];
		while (left<=right) {
			while (arr[left]<pivot) left++;
			while(arr[right]>pivot) right--;
			if(left<=right){
				int tmp=arr[left];
				arr[left]=arr[right];
				arr[right]=tmp;
				left++;
				right--;
			}
		}
		return left;
	}

}
