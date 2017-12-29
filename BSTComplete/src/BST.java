
public class BST {

	public Node root;

	public BST() {
		root = null;
	}

	public void add(int value) {
		root = add(root, value);
	}

	private Node add(Node root, int value) {
		if (root == null) {
			root = new Node(value);
		} else if (root.getData() > value) {
			root.leftChild = add(root.leftChild, value);
		} else if (root.getData() < value) {
			root.rightChild = add(root.rightChild, value);
		}
		return root;
	}

	public boolean search(int x) {
		return search(root, x);
	}

	private boolean search(Node node, int x) {
		boolean found = false;
		while (node != null && !found) {
			if (node.getData() > x) {
				node = node.leftChild;
			} else if (node.getData() < x) {
				node = node.rightChild;
			} else {
				found = true;
				break;
			}
			found = search(node, x);
		}
		return found;
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(7);
		bst.add(1);
		bst.add(0);
		bst.add(3);
		bst.add(2);
		bst.add(5);
		bst.add(4);
		bst.add(6);
		bst.add(9);
		bst.add(8);
		bst.add(10);
		// System.out.println(bst.search(28));
		System.out.println("------------------Pre Order-----------------------");
		preOrderTraversal(bst.root);
		System.out.println();
		System.out.println("------------------In Order-----------------------");
		inOrderTraversal(bst.root);
		System.out.println();
		System.out.println("------------------Post Order-----------------------");
		postOrderTraversal(bst.root);
	}

	private static void preOrderTraversal(Node root2) {
		if (root2 == null)
			return;
		System.out.print(root2.getData() + " ");
		preOrderTraversal(root2.leftChild);
		preOrderTraversal(root2.rightChild);

	}

	private static void inOrderTraversal(Node root2) {
		if (root2 == null)
			return;
		inOrderTraversal(root2.leftChild);
		System.out.print(root2.getData() + " ");
		inOrderTraversal(root2.rightChild);

	}

	private static void postOrderTraversal(Node root2) {
		if (root2 == null)
			return;
		postOrderTraversal(root2.leftChild);
		postOrderTraversal(root2.rightChild);
		System.out.print(root2.getData() + " ");

	}
}
