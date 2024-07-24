package stack;

import common.Node;

/**
 * @author mchitrashekar
 */
public class StackImpl<C> {
    Node top;

    public StackImpl() {
    }

    public void push(int data)
    {
        Node node = new Node(data);
        if(top == null)
        {
            top= node;
        }
        else
        {
            Node temp = top;
            top = node;
            top.setNext(temp);
        }
    }

    public void pop()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top.getNext();
        System.out.println("Popped "+top.getValue());
        top = temp;
    }

    public static void main(String args[]){
        StackImpl<Integer> stack = new StackImpl<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
