
public class Stack {

	private int[] stackObject;
	private int size;
	private int firstElement;
	
	public Stack(){
		size=1;
		firstElement=-1;
		stackObject=new int[size];
	}
	
	public void push(int val){
		if (firstElement>=size-1) {
			resize();
		}
		stackObject[++firstElement]=val;
	}
	public Integer pop(){
		if (firstElement>-1) {
			return stackObject[firstElement--];
		}
		return null;
	}
	private void resize() {
		size=size*2;
		int [] temp=stackObject;
		stackObject=new int[size];
		for (int i = 0; i < temp.length; i++) {
			stackObject[i]=temp[i];
		}
		
	}
}
