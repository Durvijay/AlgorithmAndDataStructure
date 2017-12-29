import java.util.LinkedList;
import java.util.Queue;

public class MinimumJumpsEnd1 {

	public static void main(String[] args) {
		int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		//System.out.println(minJumps(arr, 0, arr.length));
		System.out.println(minimumJump(arr,0,arr.length));
	}

	private static int minimumJump(int[] arr,int start, int length) {
		if(start==length)
			return 0;
		if(arr[start]==0)
			return Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = start+1; i <= length && i<=start+arr[start]; i++) {
			
			int jumps=minimumJump(arr,i, length);
			if(jumps!=Integer.MAX_VALUE && jumps+1<min){
				System.out.println(i+" "+jumps);
				min=jumps+1;
			}
		}
		return min;
	}

	//	minJumps(arr, 0, n-1)
	static int minJumps(int arr[], int l, int h)
	{
	   if (h == l)
	     return 0;
	 
	   if (arr[l] == 0)
	     return Integer.MAX_VALUE;
	   int min = Integer.MAX_VALUE;
	   for (int i = l+1; i <= h && i <= l + arr[l]; i++)
	   {
	       int jumps = minJumps(arr, i, h);
	       if(jumps != Integer.MAX_VALUE && jumps + 1 < min)
	           min = jumps + 1;
	   }
	 
	   return min;
	}
}
