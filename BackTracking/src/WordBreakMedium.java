import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordBreakMedium {

	public static void main(String[] args) {

		String s = "abcd";
		String dictionary[] = { "b", "bcd","a","abcd" };
		List<String> wordDict = Arrays.asList(dictionary);
		// String list=wordBreak(s,wordDict);
		System.out.println(wordBreak(s, wordDict));

	}

	public static boolean wordBreak(String s, List<String> dict) {

		boolean[] f = new boolean[s.length() + 1];

		f[0] = true;

		// First DP
		for (int i = 1; i <= s.length(); i++) {
			for (String str : dict) {
				if (str.length() <= i) {
					if (f[i - str.length()]) {
						if (s.substring(i - str.length(), i).equals(str)) {
							f[i] = true;
							break;
						}
					}
				}
			}
		}
		return f[s.length()];
	}

	public static String wordBreakUtil1(String s, List<String> wordDict) {
		System.out.println(s);
		if (s.length() == 0) {
			return "";
		}
		for (String words : wordDict) {
			if (s.startsWith(words) && s.contains(words)) {

				String subList = wordBreakUtil1(s.substring(words.length()), wordDict);
				if (subList.equals(""))
					return "";
			}
		}

		return s;

	}

}
