import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.tree.TreeNode;

public class compilers {

	public static void main(String[] args) {
		
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        addNodeToList(result, 0, root);
        Collections.reverse(result);
        return result;
    }
    public static void addNodeToList(List<List<Integer>> result, int level, TreeNode root) {
        if (null == root) {
            return;
        }
        List<Integer> list = null;
        if (result.size() <= level) {
            list = new ArrayList<>();
            result.add(level, list);
        } else {
            list = result.get(level);
        }
        list.add(root.val);
        addNodeToList(result, level + 1, root.left);
        addNodeToList(result, level + 1, root.right);
	}
	
	
}