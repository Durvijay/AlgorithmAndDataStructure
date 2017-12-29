import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class duplicateString {
	public static void main(String args[]) {
		String str = "geeksforgeeks";
		Set<String> set=new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.substring(i, i+1));
		//	System.out.println(str.substring(i,i+1));
		}
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next());
			
		}
	}
}
