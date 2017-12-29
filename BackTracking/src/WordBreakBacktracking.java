import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordBreakBacktracking {

	public static void main(String[] args) {

		String input="ilikesamsungmobile";
	//	System.out.println(input.substring(0,1));
		String dictionary[] = { "i","like","sam","sung","samsung","mobile","ice","cream","icecream","man","go","mango"};
		List<String> subList=wordBreakUtil(input,dictionary,new HashMap<>());
		for (String string : subList) {
			System.out.println(string);
		}
		
	}

	static List<String> wordBreakUtil(String str, String[] dictionary, HashMap<String,List<String>> hashMap)
	{
		if(hashMap.containsKey(str)){
			return hashMap.get(str);
		}
		List<String> list=new ArrayList<>();
		if(str.length()==0){
			list.add("");
			return list;
		}
			
	
	    for (String word:dictionary)
	    {
	        if (str.startsWith(word))
	        {
	            List<String> subList=wordBreakUtil(str.substring(word.length()),dictionary,hashMap);
	            for (String string : subList) {
					list.add(word+(string.length()==0?"":" ")+string);
				}
	        }
	    }
	    hashMap.put(str, list);
		return list; 
	}
	
	

}
