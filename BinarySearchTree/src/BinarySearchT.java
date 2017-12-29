import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchT {
	Node root;
	Queue<String> queue=new LinkedList<>();
	Stack<String> stack=new Stack<>();

	public void add(int key,String name) {
		Node newNode=new Node(key, name);
		if(root==null){
			root=newNode;
		}else{
			Node focusNode=root;
			Node parent;
			while (true) {
				parent=focusNode;
				if(key<focusNode.key){
					focusNode=focusNode.leftChild;
					if (focusNode==null) {
						parent.leftChild=newNode;
						return;
					}
				}else{
					focusNode=focusNode.rightChild;
					if(focusNode==null){
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}

}
