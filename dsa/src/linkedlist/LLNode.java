package dsa.src.linkedlist;

public class LLNode {

	int data;
	LLNode next;
	public LLNode(int data1){
		this.data = data1;
		this.next = null;
	}
	public LLNode(int data1, LLNode next1) {
		this.data = data1;
		this.next = next1;
	}
}
