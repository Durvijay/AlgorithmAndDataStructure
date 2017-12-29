
public class DepthofBinaryTree {
	
	
	
	public static void main(String args[]){
		BTree root=new BTree(5);
		root.left=new BTree(1);
		root.left.right=new BTree(2);
		root.right=new BTree(3);
		root.left.left=new BTree(4);
		root.left.left.left=new BTree(6);
		root.left.left.left.right=new BTree(9);
		System.out.println(new DepthofBinaryTree().minDepth(root));
		System.out.println(new DepthofBinaryTree().maxDepth(root));
	}
	public int minDepth(BTree root) {
		if (root == null)
			return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
	}
	
	public int maxDepth(BTree root) {
		if (root == null)
			return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return (left == 0 || right == 0) ? left + right + 1 : Math.max(left, right) +1;
	}
}
