package linkedlist;

public class RemoveDupes {

    public static void main(String[] args){

        LinkedList linkedList = LinkedList.getLinkedList();
        linkedList.displayNodes();
        linkedList.removeDuplicates();
        System.out.println("Linked list after removing duplicates");
        linkedList.displayNodes();
    }



}
