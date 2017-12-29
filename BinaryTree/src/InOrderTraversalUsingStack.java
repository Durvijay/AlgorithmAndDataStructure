import java.util.Stack;

public class InOrderTraversalUsingStack {
/*			    1
			  /   \
			2      3
		  /  \
	     4     5*/
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(5);
	
		inOrderTraversal(node);

	}

private static void inOrderTraversal(TreeNode node) {
	if(node==null)
		return;
	TreeNode root=node;
	Stack<TreeNode> stk=new Stack<>();
	while(root!=null){
		stk.push(root);
		root=root.left;
	}
	while(stk.size()>0){
		TreeNode temp=stk.pop();
		System.out.print(temp.val+" ");
		temp=temp.right;
		while (temp!=null) {
			stk.push(temp);
			temp=temp.left;
		}
	}
	
}

}
