import java.util.HashMap;
import java.util.Map;

public class MatchPattern {

	public static void main(String[] args) {
		String str = "GraphTreesGraph";
		String pattern = "aba";

		matchPattern(str,str.length(),pattern,pattern.length(),new HashMap<>());
	}
	
	
	HashMap<String,String> res=new HashMap<>();
	private static void matchPattern(String str, int strLen, String pattern, int patLen, Map<String,String> res) {
		for (int i = 1; i <= strLen; i++) {
			String sub=str.substring(0,i);
			if(!res.containsKey(sub)){
				res.put(sub, pattern.charAt(0)+"");
			}
		}
		
	}

}
