package linkedlist;

/**
 * @author mchitrashekar
 */
public class ReverseLinkedList {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(789);
        linkedList.displayNodes();
        linkedList.reverseList();
        System.out.println("Linked list after reversing ");
        linkedList.displayNodes();
    }

}
