
public class LinkedList1 {
	private static Link head;

	public LinkedList1(){
		head=null;
	}
	public void insert(int data) {
		Link newLink = new Link(data);
		newLink.next = head;
		head = newLink;
	}

	public void print() {
		Link current = head;
		while (current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}

	private boolean delete(int data) {
		Link n=null;
		if (head == null) {
			return false;
		}
		if (head.data==data) {
			head=head.next;
			return true;
		}
		n=head;
		while (n.next!=null) {
			if (n.next.data==data) {
				n.next=n.next.next;
				return true;
			}
				n=n.next;
		}
		return false;

	}

	public Link reverseList() {
		Link tempp=head;
		Link prev = null;
		Link curr = tempp;
	    while (curr != null) {
	    	Link nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    head=prev;
	    return prev;
	}
	
	public static void reverseList1(Link curr) {
		if(curr==null)
			return;
		if(curr.next==null){
			Link head=curr;
			return;
		}
		reverseList1(curr.next);
		curr.next.next=curr;
		curr.next=null;
		
	}
	public static void main(String[] args) {
		LinkedList1 linklist=new LinkedList1();
		linklist.insert(15);
		linklist.insert(25);
		linklist.insert(35);
		linklist.insert(45);
		linklist.insert(55);
		linklist.insert(65);
		linklist.print();
		linklist.delete(55);
		linklist.print();
		linklist.reverseList1(head);
		linklist.print();
		
	}

}
