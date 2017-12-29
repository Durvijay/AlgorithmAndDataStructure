import java.util.ArrayList;
import java.util.List;

public class NestedListWeightSum {

	public static void main(String[] args) {
		int depth=0;
		List<List> list=new ArrayList<>();
		List<List<Integer>> list2=new ArrayList<>();
		list2.add(new ArrayList<>());
		list.add(list2);
		System.err.println(list.size());
				
		
	}

	public int help(List<NestedInteger> nestedList,int depth){
		if(nestedList!=null || nestedList.size()==0)
			return 0;
		int sum=0;
		
		for (NestedInteger list:nestedList) {
			depth++;
			if(list.isInteger()){
				sum+=list.getInteger()*depth;
			}else{
				sum+=help(list.getList(), depth);
			}
		}
		return sum;
	}
}
