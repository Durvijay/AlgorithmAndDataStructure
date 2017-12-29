
public class DoublyLinkedList {
	public Link head;
	int size=0;
	
	public DoublyLinkedList(){
		head=null;
		size=0;
	}
	
	public void insertFront(int data){
		if (head==null) {
			head=new Link(null,data,null);
		}else{
			Link newLink = new Link(null,data,head);
			head.previous=newLink;
			head=newLink;
		}
		size++;
	}
	
	public void insertBack(int data){
		if (head==null) {
			head=new Link(null,data,null);
		}else{
			Link current=head;
			while (current.next!=null) {
				current=current.next;
			}
			
			Link newLink = new Link(head,data,null);
			current.next=newLink;
			
		}
		size++;
	}
	private void removeHead() {
		head=head.next;
		head.previous=null;
		size--;

	}	private void removeBack() {
		Link current=head;
		if (head.next==null) {
			head=null;
			size--;
			return;
		}
		while(current.next.next!=null){
			current=current.next;
		}
		current.next=null;
		

	}
	public void print(){
		Link current=head;
		while (current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	public void insertAt(int data,int index){
		if (head==null) return;
		if(index<1 || index>size) return;
		int i=1;
		Link current=head;
		while (i<index) {
			current=current.next;
			i++;
		}
		if (current.previous==null) {
			Link newLink=new Link(null,data,current);
			current.previous=newLink;
			head=newLink;
		}else{
			Link newLink=new Link(current.previous,data,current);
			current.previous.next=newLink;
			current.previous=newLink;
		}
		size++;
	}
	
	public void removeAt(int index){
		if (head==null) return;
		if(index<1 || index>size) return;
		int i=1;
		Link current=head;
		while (i<index) {
			current=current.next;
			i++;
		}
		if (current.next==null) {
			current.previous.next=null;
		}else if (current.previous==null) {
			current=current.next;
			current.previous=null;
			head=current;
		}else{
			current.previous.next=current.next;
			current.next.previous=current.previous;
		}
		size--;
	}
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
		doublyLinkedList.insertFront(15);
		doublyLinkedList.insertFront(25);
		doublyLinkedList.insertBack(35);
		doublyLinkedList.insertFront(45);
		doublyLinkedList.insertFront(55);
		doublyLinkedList.insertFront(65);
		doublyLinkedList.insertBack(0);
		doublyLinkedList.removeBack();
		doublyLinkedList.removeHead();
		doublyLinkedList.insertAt(100,1);
		doublyLinkedList.insertAt(100,3);
		doublyLinkedList.insertAt(100,5);
		doublyLinkedList.print();
		System.out.println("-----------------------------------");
		doublyLinkedList.removeAt(5);
		doublyLinkedList.print();

	}

}
