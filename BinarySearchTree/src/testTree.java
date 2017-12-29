
public class testTree {

	public static void main(String[] args) {
		BinaryTree btree=new BinaryTree();
		btree.addNode(50, "Boss");
		btree.addNode(26, "employee1");
		btree.addNode(35, "employee6");
		btree.addNode(25, "employee2");
		btree.addNode(21, "employee3");
		btree.addNode(28, "employee4");
		btree.addNode(29, "employee5");
		btree.inOrderTraversal(btree.root);

	}

}
