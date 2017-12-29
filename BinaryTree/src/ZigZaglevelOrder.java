import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ZigZaglevelOrder {

	public static void main(String[] args) {

//        1
//       / \
//      3   2
//     / \   \  
//    5   3   9 
		// Output: [1, 3, 9]  [0,2,4,1,null,3,-1,5,1,null,6,null,8]
		TreeNode node = new TreeNode(0);
		node.left = new TreeNode(2);
		node.right = new TreeNode(4);
		node.left.left = new TreeNode(1);
		node.left.left.left = new TreeNode(5);
		node.left.left.right = new TreeNode(1);
		node.right.left = new TreeNode(3);
		node.right.left.right = new TreeNode(6);
		node.right.right = new TreeNode(1);
		node.right.right.right = new TreeNode(8);

		
		/*code=increase(code);
		code=increase(code);
		System.out.println(code);*/
		/*List<Integer> temp = largestValues(node);
		for (Integer integer : temp) {
			System.out.print(integer + " ");
		}*/
		
		List<List<Integer>> result = zigzagLevelOrder(node);
		for (List<Integer> list : result) {
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
		}
		
	}
	private static String increase(String s){
        int i=0;
        for(;i<s.length();i++){
            if (s.charAt(i)=='Z')
                continue;
        }
        if(i==s.length())
            return s;
        else{
            StringBuilder sb=new StringBuilder(s);
            if(s.charAt(i)=='9')
                sb.setCharAt(i,'a');
           	else if (s.charAt(i)=='z')
                sb.setCharAt(i,'A');
            else
                sb.setCharAt(i,(char)(s.charAt(i)+1));
            return sb.toString();
        }
	}

	static int sum=0;
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
       // System.out.print("-"+root.val+" ");
        if(root.left!=null && root.left.left==null && root.left.right==null){
        	System.out.println(sum+root.left.val);
            return sum=sum+root.left.val;
        }else
            return sum;
    }
	static List<Integer> result = new ArrayList<>();

	public static List<Integer> largestValues(TreeNode root) {
		if(root==null)
			return result;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		result.add(root.val);
		while (queue.size()>0) {
			int size=queue.size();
			Integer max=null;
			
			for (int i = 0; i < size; i++) {
				TreeNode node=queue.poll();
				if(node.left!=null){
					queue.add(node.left);
					if(max==null){
						max=node.left.val;
					}else if(max <node.left.val)
						max=node.left.val;
				}
				if(node.right!=null){
					queue.add(node.right);
					if(max==null){
						max=node.right.val;
					}else if(max <node.right.val)
						max=node.right.val;
				}
			}
			if(max!=null)
			result.add(max);
		}
		return result;
		
	}

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if (root == null)
			return new ArrayList();
		boolean bool = true;
		List<List<Integer>> result = new ArrayList();
		Queue<TreeNode> que = new LinkedList();
		que.add(root);
		while (que.size() != 0) {
			int size = que.size();
			bool=!bool;
			List<Integer> values = new ArrayList();
			for (int i = 0; i < size; i++) {
				TreeNode temp = que.poll();
				List<Integer> list = new ArrayList();
				if (bool) {
					if (temp.left != null)
						que.add(temp.left);
					if (temp.right != null)
						que.add(temp.right);
				} else {
					if (temp.right != null)
						que.add(temp.right);
					if (temp.left != null)
						que.add(temp.left);
				}
				values.add(temp.val);
			}
			result.add(values);
		}
		return result;
	}

}
