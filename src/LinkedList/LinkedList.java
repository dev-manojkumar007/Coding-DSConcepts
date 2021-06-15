package LinkedList;

/**
 * Created by dev-manojkumar007 on 15 Jun, 2021
 *  Basic Linked List Implementation.
 *  Linked List traversal.
 *  Deleting a key from LinkedList
 */
public class LinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void printList() {

        Node current = head;

        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();

    }

     Node deleteKey(int key){

        if(head.data == key){
            head = head.next;
            return head;
        }

        Node curr=head, prev=null;

        while(curr!=null){
            if(curr.data == key) {
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {

        LinkedList List = new LinkedList();

        List.head = new Node(5);
        List.head.next = new Node(7);
        List.head.next.next = new Node(9);

        List.printList();
        Insertion.insertAtBeginning(List.head,1);
        List.printList();
        Insertion.insertAtEnd(List.head,11);
        Insertion.insertAtEnd(List.head,13);
        Insertion.insertAtEnd(List.head,15);
        List.printList();
        List.deleteKey(7);
        List.printList();
        System.out.println(Counting.findLengthIteratively(List.head));
        System.out.println(Counting.findLengthRecursively(List.head));
        System.out.println(Searching.isPresentIteratively(List.head,11));
        System.out.println(Searching.isPresentRecursively(List.head,55));

    }

}
