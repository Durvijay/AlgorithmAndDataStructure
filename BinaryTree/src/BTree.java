
public class BTree {
	int key;
	String name;
	
	BTree left;
	BTree right;
	
	public BTree(int key) {
		this.key = key;
	}


	public String toString() {
		return  name +" has a key "+key;
	}
	
	
}
