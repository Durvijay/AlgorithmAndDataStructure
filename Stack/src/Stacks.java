
public class Stacks {
	private int [] object;
	private int size;
	private int firstElement;
	
	public Stacks(){
		size=1;
		firstElement=-1;
		object=new int[size];
	}
	
	public Integer pop(){
		if (firstElement>-1) {
			return object[firstElement--];
			
		}
		return null;
	}
	
	public void push(int data){
		if (firstElement>=object.length-1) {
			resize();
		}
		object[++firstElement]=data;
	}

	private void resize() {
		size=size*2;
		int [] temp=object;
		object=new int[size];
		for (int i = 0; i < temp.length; i++) {
			object[i]=temp[i];
		}
	}
}
