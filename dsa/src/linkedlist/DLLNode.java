package dsa.src.linkedlist;

public class DLLNode {
    int data;
    DLLNode next;
    DLLNode back;
    public DLLNode(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
    public DLLNode(int data1, DLLNode next1, DLLNode back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
}
