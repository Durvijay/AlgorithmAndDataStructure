package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {
	static int [] left=null;
	static int [] right=null;
	static int [] result=null;
	public static void main(String[] args) {
		int arr[]={2,1,3,4,6,3,8,9,10,12,56};
		slidingWindow(arr, 4);
		left=maxSlidingWindow(arr, 4);
		for (int i = 0; i < left.length; i++) {
			System.out.print(left[i]+" ");
		}
		/*System.out.println();
		for (int i = 0; i < right.length; i++) {
			System.out.print(right[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}*/
	}
	//int arr[]={2,1,3,4,6,3,8,9,10,12,56};
	public static int[] maxSlidingWindow(int[] a, int k) {		
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
	}
	public static void slidingWindow(int [] arr,int w){
		result=new int [arr.length-w+1];
		left=new int [arr.length];
		right=new int [arr.length];
		left[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
			left[i]=(i%w)==0?arr[i]:Math.max(arr[i], arr[i-1]);
		}
		for (int i = arr.length-1; i >= 0; i--) {
			right[i]=(i%w)==0?arr[i]:Math.max(arr[i], arr[i-1]);
		}
		for (int i = 0; i <= (arr.length-w); i++) {
			result[i]=Math.max(right[i], left[i+w-1]);
		}
		
	}
}
