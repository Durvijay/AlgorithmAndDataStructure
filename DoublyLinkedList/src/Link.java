
public class Link {
	public int data;
	public Link previous;
	public Link next;

	public Link(int data) {
		this.data = data;
		previous = next = null;
	}
	
	public Link(Link previous,int data, Link next){
		this.data=data;
		this.previous=previous;
		this.next=next;
	}
}
