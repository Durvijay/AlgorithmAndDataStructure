public class CombinationOfElem {

	public static void main(String[] args) {
		int n=3;
		getCombinations(n);

	}

	
	private static void getCombinations(int n) {
		 int[] arr=new int[n*2];
		getAllCombinationRec(arr,1,n);		
	}
	private static void getAllCombinationRec(int[] arr, int elem, int n) {
		if(elem>n){
			for (int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}else{
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==0 && (i+elem+1)<2*n && arr[i+elem+1]==0){
					arr[i]=elem;
					arr[i+elem+1]=elem;
					getAllCombinationRec(arr, elem+1, n);
					arr[i]=0;
					arr[i+1+elem]=0;
				}
			}
		}
		
	}

}
