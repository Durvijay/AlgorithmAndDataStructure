
public class BinaryTree {

	Node root;
	
	public void addNode(int key,String name){
		Node newNode=new Node(key, name);
		if (root==null) {
			root=newNode;
		}else{
			Node focusNode=root;
			Node parent;
			while(true){
				parent=focusNode;
				if(key<focusNode.key){
					focusNode=focusNode.leftChild;
					if (focusNode==null) {
						parent.leftChild=newNode;
						return;
					}
				}else{
					focusNode=focusNode.rightChild;
					if (focusNode==null) {
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(Node focusNode){
		if(focusNode!=null){
			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode);			
			inOrderTraversal(focusNode.rightChild);

		}
	}
	public void preOrderTraversal(Node focusNode){
		if(focusNode!=null){
			System.out.println(focusNode);	
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);

		}
	}
	public BinaryTree(){
		root=null;
	}

}
