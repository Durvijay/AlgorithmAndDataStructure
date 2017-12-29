//O(n)
public class MinimumJumpsEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		// System.out.println(minJumps(arr, 0, arr.length));
		System.out.println(minimumJump(arr, arr.length));

	}

	private static int minimumJump(int[] arr, int n) {
		if (arr[0] == 0)
			return 0;

		int maxReach = arr[0]; // stores all time the maximal reachable index in
								// the array.
		int step = arr[0]; // stores the amount of steps we can still take
		int jump = 1;
		for (int i = 1; i < arr.length; i++) {
			if (i == n - 1)
				return jump;
			
			maxReach = Math.max(maxReach, arr[i] + i);
			step--;

			
			if (step == 0) {
				jump++;
				if (i >= maxReach) {
					return -1;
				}
				step = maxReach-i;
			}

		}
		return -1;
	}

}
