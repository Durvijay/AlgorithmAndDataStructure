import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// Java program to implement a stack that supports
// getMinimum() in O(1) time and O(1) extra space.

// A user defined stack that supports getMin() in
// addition to push() and pop()
class MyStack {
	java.util.Stack<Integer> s;
	Integer minEle;

	// Constructor
	MyStack() {
		s = new java.util.Stack<>();
	}

	public void push(int i) {
		if(s.isEmpty()){
			s.push(i);
			minEle=i;
			return;
		}
		if(minEle>i){
			s.push(2*i-minEle);
			minEle=i;
		}else{
			s.push(i);
			
		}
		
	}

	public Integer pop() {
		if(s.isEmpty()){
			return null;
		}
		Integer t=s.pop();
		
		if(t>minEle)
			return t;
		else{
			return 2*minEle-t;
		}	
	}

	public Integer getMin() {
		return minEle;
		
	}

	public void peek() {
		if(s.isEmpty())
			System.out.println("Empty"); 
		Integer t=s.peek();
		if(t<minEle)
			System.out.println("LAst element :"+ (2*minEle-t));
		else
			System.out.println("LAst element :"+ t);
		
	}
	

};


// Driver Code
public class MinElement {
	public static void main(String[] args) throws ParseException  {
		int nums[]={1, 3, 5, 7, 9, 11};
		System.out.println(numberOfArithmeticSlices(nums));
		HashSet<String> hash=new HashSet<>();
		//for(Map.Entry<K, V>)
		 

	}
	
	public static int numberOfArithmeticSlices(int[] A) {
        if(A.length<3){
            return 0;
        }
        int first=A[0];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> list;
        for(int i=0;i<A.length-1;i++){
        	 int diff=Math.abs(A[i]-A[i+1]);
        	if(!map.containsKey(diff)){
        		list=new ArrayList<Integer>();
        		list.add(A[i]);
                map.put(diff,list);
            }
            for(int j=i+1;j<A.length;j++){
                diff=Math.abs(A[i]-A[j]);
                list=new ArrayList<Integer>();
                if(map.containsKey(diff)){
                    list=map.get(diff);
                    list.add(A[j]);
                }
                map.put(diff,list);
            }
        }

        int total=0;
        for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()){
            list=entry.getValue();
            int len=list.size();
            if(len>2){
                total+= (len - 1) * (len - 2) * 0.5;
            }
            
            
        }

        return total;
    }
	public static int majorityElement(int[] nums) {
        if (null == nums || 0 == nums.length)
            return Integer.MAX_VALUE;

        int count = 1, majority = nums[0];
        for (int i = 1; i < nums.length; ++i)
        {
            if (count == 0)
            {
                ++count;
                majority = nums[i];
            }
            else if (majority == nums[i])
                ++count;
            else
                --count;
        }
        return majority;
    }
}