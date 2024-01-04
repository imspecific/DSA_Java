package dsa.src.linkedlist;

import com.sun.media.sound.SimpleSoundbank;

class LLOperations {
    public static void main(String[] args) {
        LLNode head = null;
        head = insertAtBeg(40, head);
        head = insertAtBeg(30, head);
        head = insertAtBeg(20, head);
        head = insertAtBeg(10, head);
        System.out.println("LinkedList before: ");
        displayLL(head);
        System.out.println("Insertion at beg: ");
        //head = insertAtBeg(3, head);
        displayLL(head);
        System.out.println("Insertion at end: ");
        //head = insertAtEnd(head, 6);
        displayLL(head);
        System.out.println("Reverse the LL by iterative method: ");
        //head = iterativeReverseLL(head);
        displayLL(head);
        System.out.println("Reverse the LL by recursive method: ");
        head = recursiveReverseLL(head);
        displayLL(head);
    }

    static void displayLL(LLNode head) {
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static LLNode insertAtBeg(int data, LLNode head) {
        LLNode temp = new LLNode(data);
        temp.next = head;
        head = temp;
        return head;
    }

    static LLNode insertAtEnd(LLNode head, int data) {
        if (head == null)
            return new LLNode(data);

        LLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        LLNode newNode = new LLNode(data);
        temp.next = newNode;

        return head;
    }

    static LLNode iterativeReverseLL (LLNode head) {
        LLNode temp = head;
        LLNode prev = null;

        while(temp != null) {
            LLNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    static LLNode recursiveReverseLL (LLNode head) {
        if(head == null || head.next == null)   // Base case
            return head;

        LLNode newHead = recursiveReverseLL(head.next);
        LLNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
