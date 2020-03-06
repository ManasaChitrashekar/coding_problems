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
        if(head == null || head.next == null)
            return;
        while(head.next!=null)
        {
            Node runner = head.next;
            Node prev = head;
            while(runner.next!=null){
                if(head.value == runner.value)
                {
                    runner.next = runner.next.next;
                }
                else
                {
                    prev = runner;
                    runner = runner.next;

                }
            }
            head = head.next;
        }
        
    }
}
