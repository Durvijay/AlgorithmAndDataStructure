import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class testing {

	public static void main(String[] args) {
	//	int [] abc=countBits(8);
		int [] abcd={4,3,2,7,8,2,3,1};
		List<Integer> abcde=findDuplicates(abcd);
		/*for (int i : abcde) {
			System.out.print(i+" ");
		}*/
		int [] nums1 = {4,1,2}, nums2 = {1,3,4,2};
		System.out.println(nextGreaterElement(nums1, nums2) );
		Stack<Integer> abc=new Stack<>();
		abc.isEmpty();
	}
	
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
	
	public static String reverseString(String s) {
        String beg="";
        String last="";
        for(int i=0;i<s.length()/2;i++){
            beg=s.charAt(i)+beg;
            last+=s.charAt(s.length()-1-i);
        }
       
        return s.length()%2==0?last+beg:last+s.charAt(s.length()/2)+beg;
    }
	 public static List<Integer> findDuplicates(int[] nums) {
	        List<Integer> res = new ArrayList<>();
	        for (int i = 0; i < nums.length; ++i) {
	            int index = Math.abs(nums[i])-1;
	            if (nums[index] < 0)
	                res.add(Math.abs(index+1));
	            nums[index] = -nums[index];
	        }
	        return res;
	    }
	 public static int[] countBits(int num) {
	        
	        int [] result=new int[num+1];
	        if(num>=0)
	            result[0]=0;
	        if(num>0)
	            result[1]=1;
	        if(num>1)
	            result[2]=1;
	        if(num>2)
	            result[3]=2;
	        int n=4,j=4,temp=0;
	        for(int i=4;i<=num;i++){
	            if(n==j){
	                temp=n;
	                j=n/2;
	                result[i]=result[j];
	                n=n*2;
	            }else if(temp>=j){
	                j=(j/2)+1;
	                result[i]=result[j]+1;
	            }else{
	                result[i]=result[j];
	            }
	            j++;
	        }
	        return result;
	    }

}
