package dsa.src.linkedlist;

class LLOperations {
    public static void main(String[] args) {
        LLNode head = null;
        head = insertAtBeg(40, head);
        head = insertAtBeg(30, head);
        head = insertAtBeg(20, head);
        head = insertAtBeg(10, head);
        System.out.println("LinkedList before inserting: ");
        displayLL(head);
        head = insertAtBeg(3, head);
        System.out.println("LinkedList after inserting: ");
        displayLL(head);
    }

    static void displayLL(LLNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static LLNode insertAtBeg(int data, LLNode head) {
        LLNode temp = new LLNode(data);
        temp.next = head;
        head = temp;
        return head;
    }
}
