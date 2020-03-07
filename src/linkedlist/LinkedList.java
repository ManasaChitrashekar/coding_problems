package linkedlist;

public class LinkedList {
    Node head;

    public void add(int i) {
        Node node = new Node(i);
        if(head == null)
        {
            head = node;
            return;
        }
        if(head.next==null)
        {
            head.next= node;
            return;
        }
        Node cur = head;
        while(cur.next!=null)
        {
            cur = cur.next;
        }
        cur.next = node;

    }

    public void displayNodes() {
        if(head == null)
            return;
        if(head.next == null)
        {
            System.out.println(head.value);
            return;
        }
        Node cur = head;
        while(cur!=null)
        {
            System.out.println(cur.value);
            cur = cur.next;
        }
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
            while(runner.next!=null){
                if(cur.value == runner.next.value)
                {
                    runner.next = runner.next.next;
                }
                else
                {
                    runner = runner.next;
                }
            }
            cur = cur.next;
        }
        
    }
}
