
public class StackMin {

	private int [] values;
	private int size;
	private int count;
	
	public StackMin() {
		size=1;
		count=0;
		values=new int [size];
	}

	public void add(int val){
		if(count>=values.length){
			resize();
		}
		values[count++]=val;
	}
	public Integer pop(){
		if(count<=0)
			return null;
		int result =values[--count];
		return result;
	}
	
	private void resize() {
		int [] temp=values;
		values=new int[values.length*2];
		int k=0;
		for (int i : temp) {
			values[k++]=i;
		}
		
	}

	public static void main(String[] args) {
		StackMin min=new StackMin();
		min.add(5);
		min.add(15);
		System.out.println(min.pop());
		System.out.println(min.pop());
		System.out.println(min.pop());

	}

}
