package Tree;

public class TreeTraversal {
	
	Node root;
	
	TreeTraversal() {
		
		root = null;
	}
	
	void inOrder(Node node) { 				// In-order traversal
		
		if(node == null) {
			return;
		}
		inOrder(node.left);					// left
		System.out.print(node.data+"\t");	// root
		inOrder(node.right);				//right
	}
	
	void preOrder(Node node) {				// Pre-order traversal
		
		if(node == null) {
			return;
		}
		
		System.out.print(node.data+"\t");	// root
		preOrder(node.left);				// left
		preOrder(node.right);				// right
	}
	
	void postOrder(Node node) {				// Post-order traversal
		
		if(node == null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+"\t");
	}
	
	public static void main(String[] args) {
		TreeTraversal tr = new TreeTraversal();
		tr.root = new Node(1);
		tr.root.left = new Node(12);
		tr.root.right =  new Node(2);
		tr.root.left.left = new Node(5);
		tr.root.left.right = new Node(6);
		System.out.println("Inorder Traversal is: ");
		tr.inOrder(tr.root);
		System.out.println();
		System.out.println("Preorder Traversal is: ");
		tr.preOrder(tr.root);
		System.out.println();
		System.out.println("Posorder Traversal is: ");
		tr.postOrder(tr.root);

	}

}
