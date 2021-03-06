
public class SingleNumber {
	public static void main(String[] args) {
		int [] res= singleNumber(new int []{1, 2, 1, 3, 2, 5});
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public static int[] singleNumber(int[] nums) {
		// Pass 1 :
		// Get the XOR of the two numbers we need to find
		int diff = 0;
		for (int num : nums) {
			diff ^= num;
		}
		// Get its last set bit
		diff = Integer.highestOneBit(diff);

		// Pass 2 :
		int[] rets = { 0, 0 }; // this array stores the two numbers we will
								// return
		for (int num : nums) {
			if ((num & diff) == 0) // the bit is not set
			{
				rets[0] ^= num;
			} else // the bit is set
			{
				rets[1] ^= num;
			}
		}
		return rets;
	}
}
