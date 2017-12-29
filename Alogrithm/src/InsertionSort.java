
public class InsertionSort {

	public static void main(String[] args) {
		int array []=new int[]{12,11,7,1,9,50,13,5,6};
		print(array);
		InsertSort(array);
		print(array);
	}

	private static void InsertSort(int[] array) {
		int i,j,key;
		for (i = 1; i < array.length; i++) {
			key=array[i];
			j=i-1;
			while (j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
			print(array);
		}
		
	}
	private static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
