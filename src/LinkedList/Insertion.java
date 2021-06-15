package LinkedList;
import LinkedList.LinkedList.Node;

/**
 * Created by dev-manojkumar007 on 15 Jun, 2021
 * Insert Node at beginning and at the end.
 */
public class Insertion {

    static Node insertAtBeginning(Node head, int data) {

        Node n = new Node(data);

        if(head == null){
            head = n;
            return head;
        }

        n.next = head;
        head = n;

        return head;

    }

    static Node insertAtEnd(Node head, int data) {

        Node n = new Node(data);

        if(head == null){
            head = n;
            return head;
        }

        Node curr = head;

        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = n;

        return head;
    }
}
