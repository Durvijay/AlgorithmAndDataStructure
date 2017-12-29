
public class SelectionSort {
	public static void main(String[] args) {
		int [] arr=new int[]{55,20,8,7,5,4,10,15};
		sortSelection(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void sortSelection(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int val=arr[i];
			int index=i;
			while (index>0 && arr[index-1]>val) {
				arr[index]=arr[index-1];
				index--;
			}
			arr[index]=val;
		}
		
	}
}
