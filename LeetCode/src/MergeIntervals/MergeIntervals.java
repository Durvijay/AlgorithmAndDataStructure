package MergeIntervals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeIntervals {

	//[1,3],[2,6],[8,10],[15,18]
	//[[2,3],[4,5],[6,7],[8,9],[1,10]]
	public static void main(String[] args) {
		List<Interval> intervals =new ArrayList<>();
		intervals.add(new Interval(2,3));
		intervals.add(new Interval(4,5));
		intervals.add(new Interval(6,7));
		intervals.add(new Interval(8,9));
		intervals.add(new Interval(1,10));
		printResult(merge(intervals));
		System.out.println();
		///----------------case 2   [1,3],[2,6],[8,10],[15,18]---------------
		intervals =new ArrayList<>();
		intervals.add(new Interval(1,3));
		intervals.add(new Interval(2,6));
		intervals.add(new Interval(8,10));
		intervals.add(new Interval(15,18));
		
		printResult(merge(intervals));
		System.out.println();
		//***********case 3 [[1,4],[2,3]] -------------------
		intervals =new ArrayList<>();
		intervals.add(new Interval(1,4));
		intervals.add(new Interval(2,3));
		
		printResult(merge(intervals));
		/*List<Interval> result=merge(intervals);
		printResult(result);*/
	}
	
	

	public static List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<2){
            return intervals;
        }
        List<Interval> result=new ArrayList<Interval>();
        Queue<Interval> intervalPriorityQueue = new PriorityQueue<>(intervals.size(),new Comparator<Interval>(){
            @Override
            public  int compare(Interval o1,Interval o2){
                return Integer.compare(o1.start,o2.start);
            } 
        });
        for(Interval inter:intervals){
            intervalPriorityQueue.add(inter);
        }
        int len=intervalPriorityQueue.size()-1;
        Interval start=intervalPriorityQueue.poll();
        Interval end=null;
        
        
       while(!intervalPriorityQueue.isEmpty()){
           end=intervalPriorityQueue.poll();
           
           if(start.end<end.start){
        	   result.add(start);
        	   start=end;
           }else if(!(start.end>end.end)){
               end.start=start.start;
               start=end;
           }
           
       }
        if(start!=null)
            result.add(start);
		return result;
    }
	
	private static void printResult(List<Interval> result) {
		for (Interval interval : result) {
			System.out.print("["+interval.start+","+interval.end+"] ");
		}
	}
}
