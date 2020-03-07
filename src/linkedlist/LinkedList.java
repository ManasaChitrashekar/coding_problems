package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = head;
    }

    public void add(int i) {
        Node node = new Node(i);
        if(head == null)
        {
            head = node;
            return;
        }
        if(head.getNext()==null)
        {
            head.setNext(node);
            return;
        }
        Node cur = head;
        while(cur.getNext()!=null)
        {
            cur = cur.getNext();
        }
        cur.setNext(node);

    }

    public void displayNodes() {
        if(head == null)
            return;
        if(head.getNext() == null)
        {
            System.out.println(head.getValue());
            return;
        }
        Node cur = head;
        while(cur!=null)
        {
            System.out.println(cur.getValue());
            cur = cur.getNext();
        }
    }


    public static LinkedList getLinkedList() {

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

        return  linkedList;

    }

    /**
     * This method can be implemented by  traversing linked list and adding data to set , If adding to set returns null remove the pointed and adjust the list
     * 2nd approach is o use 2 loops through runner technique implemented below
     */
    public void removeDuplicates() {
        Node cur = head;
        while(cur!=null)
        {
            Node runner = cur;
            while(runner.getNext()!=null){
                if(cur.getValue() == runner.getNext().getValue())
                {
                    runner.setNext(runner.getNext().getNext());
                }
                else
                {
                    runner = runner.getNext();
                }
            }
            cur = cur.getNext();
        }
        
    }

    /**
     * Method 1 is to traverse through the list and count number of elements in first loop
     * in second iteration itreate through length-n to get nth last element
     *
     * Method 2 : Runner technique
     * Two pointers cur and follower - follower is n steps behind cur
     * loop through cur n number of times
     * then until cur becomes null iterate cur and follower , when cur reaches end of list followers is at nth position from last
     *
     * @param n
     * @return
     */
    public int getkthElement(int n) {
        if(head==null)
            return 0;
        Node cur = head;
        Node follower = head;

        while(n>0)
        {
            if(cur == null)
                return 0;
            cur = cur.getNext();
            n--;
        }
        //now move but follower and cur until end of list
        while(cur.getNext()!=null)
        {
            cur = cur.getNext();
            follower = follower.getNext();
        }
        return follower.getValue();
    }
}
