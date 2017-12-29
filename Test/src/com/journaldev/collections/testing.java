package com.journaldev.collections;

public class testing {

	public static void main(String[] args) {
		int [] test={8,2,3, 3, 2, 4, 6, 7};
		Range range=getLargest(test);
		System.out.println(range.start+" "+range.end);

	}

	public static Range getLargest(int[] array) {
	    int max = 1;
	    int start = 0;
	    int aux = 0;
	    int count = 1;
	    boolean temp=false;
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] >= array[i - 1]) {
	            count++;
	        } else {
	            aux = i;
	            count = 1;
	        }
	        if (count > max) {
	            max = count;
	            start = aux;
	            if(temp)
	            	break;
	        }
	        if(i==array.length-1){
	        	 if (array[array.length-1] >= array[0]) {
	        		 temp=true;
	        		 count++;
	        		 i=1;
	        	 }
	        }
	    }
	    return new Range(start, start + max - 1);
	}

	public static class Range {
	    public final int start;
	    public final int end;
	    public Range(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }
	}
}
