package linkedlist;

public class nthElementinList {
    public static  void main(String args[]){
        LinkedList linkedList = new LinkedList();
        System.out.println("kth element = "+ linkedList.getkthElement(0));
         linkedList= LinkedList.getLinkedList();
        linkedList.displayNodes();
        System.out.println("kth element = "+ linkedList.getkthElement(0));
        System.out.println("kth element = "+ linkedList.getkthElement(1));
        System.out.println("kth element = "+ linkedList.getkthElement(2));
        System.out.println("kth element = "+ linkedList.getkthElement(3));
        System.out.println("kth element = "+ linkedList.getkthElement(4));
        System.out.println("kth element = "+ linkedList.getkthElement(5));
        System.out.println("kth element = "+ linkedList.getkthElement(20));

    }
}
