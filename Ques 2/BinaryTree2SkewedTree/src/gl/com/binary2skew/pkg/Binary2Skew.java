package gl.com.binary2skew.pkg;

class Node {
	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}
}

public class Binary2Skew {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void bst2RightSkewedTree(Node root) {

		int counter = 0;

		if (root == null) {
			return;
		}

		if (counter > 0) {
			bst2RightSkewedTree(root.right);
			//System.out.println(" in if clause counter "+counter);
		} else {
			bst2RightSkewedTree(root.left);
			//System.out.println(" in else clause counter "+counter);
			//System.out.println("right & left "+root.right+" "+root.left);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
			//System.out.println("if stmt right "+root.right+" "+root.left);
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
			//System.out.println("else stmt right "+root.right+" "+root.left);
		}

		if (counter > 0) {
			bst2RightSkewedTree(leftNode);
			//System.out.println(" in 2nd if clause counter "+counter);
		} else {
			bst2RightSkewedTree(rightNode);
			//ystem.out.println(" in 2nd else clause counter "+counter);
		}
	}

	static void printRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		printRightSkewedTree(root.right);
	}

	// main
	public static void main(String[] args) {

		Binary2Skew tree = new Binary2Skew();

		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		bst2RightSkewedTree(node);
		printRightSkewedTree(headNode);
	}
}
