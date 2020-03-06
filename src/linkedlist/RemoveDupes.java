package linkedlist;

public class RemoveDupes {

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add( 1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add( 1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add( 1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add( 1);
        linkedList.add(2);
        linkedList.add(3);


        linkedList.displayNodes();
        linkedList.removeDuplicates();
        System.out.println("Linked list after removing duplicates");
        linkedList.displayNodes();
    }

}
