
public class ReverseLinkedList {

	public static void main(String[] args) {
		Node linklist=new Node();
		linklist.insert(15);
		linklist.insert(25);
		linklist.insert(35);
		linklist.insert(45);
		linklist.insert(55);
		linklist.insert(65);
		linklist.print();
		linklist.delete(55);
		linklist.print();
		Node node=ReverseLinkedList.reverseList(linklist);

	}

	public static Node reverseList(Node linklist) {
		Node prev = null;
		Node curr = linklist;
	    while (curr != null) {
	    	Node nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	}
}
