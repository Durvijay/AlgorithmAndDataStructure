import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public static void main(String[] args) {
		String test="aacd";
		permute(test);
		
        System.out.println(test.substring(4));
	}

	private static void permute(String test) {
		Set<String> result=new HashSet<>();
		combination("",test,result);
		for (String string : result) {
			System.out.println(string);
		}
		System.out.println(result.size());
	}

	private static void combination(String prefix, String suffix, Set<String> result) {
		if(suffix.length()==0){
			result.add(prefix);
		}else{
			for (int i = 0; i < suffix.length(); i++) {
				combination(prefix+suffix.charAt(i), suffix.substring(0, i)+suffix.substring(i+1, suffix.length()),result);
			}
		}
	}

}
