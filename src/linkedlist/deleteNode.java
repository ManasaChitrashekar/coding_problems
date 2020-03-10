package linkedlist;

public class deleteNode {
    public static void main(String args[]){
        deleteMiddleNode();
    }

    public static void deleteDemo() {
        LinkedList linkedList = new LinkedList();
        linkedList = LinkedList.getLinkedList();
        System.out.println("Before deleting ");
        linkedList.displayNodes();
        linkedList.deleteNode(2);
        System.out.println("After deleting ");
        linkedList.displayNodes();
    }

    public static void deleteMiddleNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println("Before deleting middle node");
        linkedList.displayNodes();
        linkedList.deleteMiddleNode();
        System.out.println("After deleting ");
        linkedList.displayNodes();
    }
}
