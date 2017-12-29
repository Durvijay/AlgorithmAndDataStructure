
public class KadaneAlogrithm {

	public static void main(String[] args) {
		int [] arr={-1,-2,-3,-4};
		System.out.println(kadane(arr));

	}
	
	public static int kadane(int [] arr){
		int start=Integer.MIN_VALUE,end=0;
		for(int j=0;j<arr.length;j++){
	        start=Math.max(start,end+arr[j]);
	        end=Math.max(start,end);
	    }
	    return start;
	}
}
