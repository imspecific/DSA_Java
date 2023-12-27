package dsa.src.tree;

public class TreeTraversal {
	TreeNode root;
	TreeTraversal() {
		root = null;
	}
	
	void inOrder(TreeNode node) { 				// In-order traversal
		if(node == null) {
			return;
		}
		inOrder(node.left);					// left
		System.out.print(node.data+"\t");	// root
		inOrder(node.right);				//right
	}
	
	void preOrder(TreeNode node) {				// Pre-order traversal
		if(node == null) {
			return;
		}
		
		System.out.print(node.data+"\t");	// root
		preOrder(node.left);				// left
		preOrder(node.right);				// right
	}
	
	void postOrder(TreeNode node) {				// Post-order traversal
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+"\t");
	}
	
	public static void main(String[] args) {
		TreeTraversal tr = new TreeTraversal();
		tr.root = new TreeNode(1);
		tr.root.left = new TreeNode(12);
		tr.root.right =  new TreeNode(2);
		tr.root.left.left = new TreeNode(5);
		tr.root.left.right = new TreeNode(6);
		System.out.println("Inorder Traversal is: ");
		tr.inOrder(tr.root);
		System.out.println();
		System.out.println("Preorder Traversal is: ");
		tr.preOrder(tr.root);
		System.out.println();
		System.out.println("Postorder Traversal is: ");
		tr.postOrder(tr.root);

	}

}
