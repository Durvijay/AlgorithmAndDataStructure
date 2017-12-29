
public class anagrams {

	public static void main(String[] args) {
		String one = "abcdgef";
		String two = "fegdcba";
		one.toCharArray();
		two.toCharArray();
		System.out.println(isAnagram(one, two));
	}

	public static boolean isAnagram(String onec, String twoc) {
		int[] arr = new int[26];
		if (onec.length() != twoc.length())
			return false;
		for (int i = 0; i < onec.length(); i++) {
			arr[onec.charAt(i) - 97]++;
			arr[twoc.charAt(i) - 97]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
