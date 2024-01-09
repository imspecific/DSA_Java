package dsa.src.linkedlist;

public class DLLOperations {

    public static void main(String[] args) {

        int[] a = {1,4,5,6,9,24};
        DLLNode head = convertToDLL(a);
        printDLL(head);

    }
    static void printDLL (DLLNode head) {
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    static DLLNode convertToDLL (int[] arr) {
        DLLNode head = new DLLNode(arr[0]);
        DLLNode prev = head;
        for(int i=1; i<arr.length; i++) {
            DLLNode temp = new DLLNode(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
