package LinkedList;
import LinkedList.LinkedList.Node;

/**
 * Created by dev-manojkumar007 on 15 Jun, 2021
 * Searching a Key in the Linked List
 * 1> Iteratively
 * 2> Recursively
 */
public class Searching {

    static boolean isPresentIteratively(Node head, int key){
        Node curr = head;

        while(curr!=null){
            if(curr.data == key)
                return true;

            curr = curr.next;
        }
        return false;
    }

    static boolean isPresentRecursively(Node head, int key){

        if(head == null)
            return false;

        if(head.data == key)
            return true;

        return isPresentRecursively(head.next,key);

    }
}
