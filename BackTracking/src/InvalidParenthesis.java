import java.util.ArrayList;
import java.util.List;

public class InvalidParenthesis {

	public static void main(String[] args) {
		String brac="()(()()";
		List<String> list=removeInvalidParentheses(brac);
		for(String str:list){
			System.out.println(str);
		}
	}

	private static List<String> removeInvalidParentheses(String brac) {
		List<String> ans=new ArrayList<>();
		remove(brac,ans,0,0,new char[]{'(',')'});
		return ans;
	}

	private static void remove(String s, List<String> ans, int last_i, int last_j, char[] cs) {
		for (int stack=0,i=last_i; i < s.length(); i++) {
			if(s.charAt(i)==cs[0]) stack++;
			if(s.charAt(i)==cs[1]) stack--;
			if(stack>=0) continue;
			for (int j = last_j; j <=i; j++) {
				if(s.charAt(j)==cs[1] && (j==last_j || s.charAt(j-1)!=cs[1]))
					remove(s.substring(0, j)+s.substring(j+1,s.length()), ans, i, j, cs);
			}
			return;
		}
		String reversed = new StringBuilder(s).reverse().toString();
		if (cs[0] == '(') // finished left to right
	        remove(reversed, ans, 0, 0, new char[]{')', '('});
	    else // finished right to left
	        ans.add(reversed);
	}

	

	

}
