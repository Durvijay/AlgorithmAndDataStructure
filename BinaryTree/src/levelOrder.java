import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null)
			return new ArrayList();
		List<List<Integer>> result = new ArrayList();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> temp = new ArrayList();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				temp.add(node.val);
			}
			result.add(0,temp);
		}
		return result;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
