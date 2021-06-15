package LinkedList;
import LinkedList.LinkedList.Node;

/**
 * Created by dev-manojkumar007 on 15 Jun, 2021
 * Counting number of nodes or find length of List.
 * 1> Iteratively
 * 2> Recursively
 */
public class Counting {

    static int findLengthIteratively(Node head){
        Node curr = head;
        int count = 0;

        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    static int findLengthRecursively(Node head){

        if(head == null)
            return 0;

        return 1 + findLengthRecursively(head.next);
    }
}
