// Java program to find all combinations where every
// element appears twice and distance between
// appearances is equal to the value
 
import java.math.BigInteger;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
 
class Tension{
	int two=45;
	
}
public class Test
{
  
     
    // Driver method
    public static void main(String[] args) 
    {
    	LocalTime t = LocalTime.parse( "17:40:53" ) ;
        System.out.println(t.getHour()*3600+t.getMinute()*60+t.getSecond());
    	int l=(int) Math.ceil((double)3/2);
        
    	System.out.println(l);
    	
    	
    	
   /* 	
    	
    	Test test=new Test();
        // given number
    	 new StringBuffer("ds").reverse().toString();
        int [] n ={1, 50, 70, 90, 110, 1, 2};//{1,82,3,4,5,23,7,8};//{2,1,2,0,1};// {7,6,4,3,1};//{7,1,5,3,6,4};// 
        System.out.println(test.containsNearbyAlmostDuplicate(n, 3, 1)+ " "+Integer.MIN_VALUE);
       List<Integer> list=new ArrayList<>();
       list.add(5);
       Tension te=new Tension();
       te.two=9;
       System.out.println(te.two+" Before");
       checkObjectref(te);
       System.out.println(te.two+ " After");*/
    }
    
    
    
    private static void checkObjectref(Tension te) {
		te.two=29;
		
	}



	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 1 || t < 0) return false;
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum / ((long) t + 1);
            if (map.containsKey(bucket)
                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= t)
                        || (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= t))
                            return true;
            if (map.entrySet().size() >= k) {
                long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
                map.remove(lastBucket);
            }
            map.put(bucket, remappedNum);
        }
        return false;
    }
    public static boolean subSum(int[] nums, int k) {
    	List<Integer> list=new ArrayList<>();
    	for (int i = 0; i < nums.length; i++) {
    		int size=list.size();
    		for (int j = 0; j < size; j++) {
				if(list.get(j)+nums[i]==k)
					return true;
				list.add(list.get(j)+nums[i]);
			}
			list.add(nums[i]);
		}
		return false;
    	
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    
    
    public int lengthOfLastWord(String s) {
        String [] temp=s.split(" ");
        return temp[temp.length-1].length();
    }
    
    public static String decodeString(String s) {
        Stack<String> stk=new Stack<String>();	
        stk.push("");							
        for(int i=0;i<s.length();i++){

        	if(Character.isDigit(s.charAt(i))){
        		int no=0;
        		while(Character.isDigit(s.charAt(i))){
        			no=no*10+(s.charAt(i)-'0');
        			i++;
        		}
        		i--;
        		stk.push(String.valueOf(no));
        	}else if (s.charAt(i)=='[') {
				stk.push("");				
			}else if (s.charAt(i)==']') {
				String temp=stk.pop();
				StringBuilder strbuf=new StringBuilder();
				int count=Integer.parseInt(stk.pop());
				for (int j = 0; j < count; j++) {
					strbuf.append(temp);
				}
				stk.push(stk.pop()+strbuf.toString());
			}else{
				stk.push(stk.pop()+s.charAt(i));
			}  
        }
        return stk.pop();
    }
   
    public static int maxProfit(int[] prices) {
    	if(prices.length<2)
            return 0;
         int min=Integer.MIN_VALUE,profit=0,max=0;
         min=prices[0];
        for(int i=1;i<prices.length;i++){
           if(min>prices[i]){
        	   min=prices[i];
           }else if(profit<(prices[i]-min)){
        	   profit=prices[i] - min;
           }
        }
        
        return profit;
    
    }
}