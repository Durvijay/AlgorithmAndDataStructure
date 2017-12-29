import java.util.HashMap;
import java.util.HashSet;

public class ReachScore {

	public static void main(String[] args) {
		int s[]={3,5,10};
		System.out.println(reachToN(s,20,s.length));
		

	}
	
	private static int reachToN(int[] s, int n, int l) {
		if(n<0){
			return 0;
		}
		if(n==0){
			return 1;
		}
		if(n>=1 && l<=0){
			return 0;
		}
		
		return reachToN(s,n,l-1)+reachToN(s, n-s[l-1], l);
	}

}
