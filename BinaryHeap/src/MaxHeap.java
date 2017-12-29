
public class MaxHeap {
	private int [] theHeap;
	private int capacity;
	private int pos;
	
	public MaxHeap(){
		pos=1;
		capacity=10;
		theHeap=new int[capacity];
	}

	public void insertMinHeap(int value){
		if(pos==capacity){
			//increse the capacity
		}else{
			theHeap[pos++]=value;
			int child=pos-1;
			int parent=child/2;
			while(theHeap[parent]<theHeap[child] && parent>0){
				int temp=theHeap[parent];
				theHeap[parent]=theHeap[child];
				theHeap[child]=temp;
				child=parent;
				parent=child/2;
			}
				
		}
	}
	public void insertMaxHeap(int value){
		if(pos==capacity){
			//increse the capacity
		}else{
			theHeap[pos++]=value;
			int child=pos-1;
			int parent=child/2;
			while(theHeap[parent]>theHeap[child] && parent>0){
				int temp=theHeap[parent];
				theHeap[parent]=theHeap[child];
				theHeap[child]=temp;
				child=parent;
				parent=child/2;
			}
				
		}
	}
	public static void main(String[] args) {
		MaxHeap maxHeap=new MaxHeap();
		maxHeap.insertMaxHeap(12);
		maxHeap.insertMaxHeap(7);
		maxHeap.insertMaxHeap(6);
		maxHeap.insertMaxHeap(10);
		maxHeap.insertMaxHeap(8);
		maxHeap.insertMaxHeap(20);
		maxHeap.print();
		//maxHeap.insertMaxHeap(12);
	}

	private void print() {
		for (int i = 1; i < pos; i++) {
			System.err.print(theHeap[i]+" ");
		}
		
	}

}
