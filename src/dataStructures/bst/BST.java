package dataStructures.bst;

public class BST {

	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a ;
	}
	
	public Node insert(Node node, int val) {
		if(node == null) {
			return createNewNode(val);
		}
		if(val < node.data) {
			node.left = insert(node.left, val);
		} else if(val>node.data) {
			node.right = insert(node.right, val);
		}
		
		return node;
	}
}
