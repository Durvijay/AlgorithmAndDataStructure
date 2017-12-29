
public class TreeNode {
	int val;
	String name;
	
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int key) {
		this.val = key;
	}


	public String toString() {
		return  name +" has a key "+val;
	}
	
	
}
