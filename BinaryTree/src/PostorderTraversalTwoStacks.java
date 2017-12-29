import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalTwoStacks {
	/*	1
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
	
//		postOrderTraversal(node);
//		System.out.println();
//		preOrderTraversal(node);
//		
		
		String test="h#dsh##bjh#s#";
		test=test.replaceAll("##", "#");
		System.out.println(test.indexOf("##")+
				" " +test);
	}

	private static void postOrderTraversal(TreeNode root) {
		if(root==null)
			return;
		Stack<TreeNode> stack1=new Stack<>();
		Stack<TreeNode> stack2=new Stack<>();
		stack1.push(root);
		while (!stack1.isEmpty()) {
			TreeNode temp=stack1.pop();
			if(temp.left!=null)
				stack1.push(temp.left);
			if(temp.right!=null)
				stack1.push(temp.right);
			stack2.push(temp);
		}
		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop().val+" ");
		}
	}

	private static void preOrderTraversal(TreeNode root) {
		if(root==null){
			return;
		}
		Stack<TreeNode> stack=new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp=stack.pop();
			System.out.print(temp.val+" ");
			if(temp.right!=null)
				stack.push(temp.right);
			if(temp.left!=null)
				stack.push(temp.left);
		}
	}
}
