package trees;

public class Node {
    Node left,right;
    int data;
    public Node(int data) {
        this.data = data;
    }

    void addNode(int value)
    {
        if(value<= data)
        {
            if(left == null)
            {
                left = new Node(value);
                System.out.println("Added to tree :"+value);
            }
            else
                left.addNode(value);
        }
        else
        {
            if(right== null)
            {
                right = new Node(value);
                System.out.println("Added to tree :"+value);
            }
            else
            {
                right.addNode(value);
            }
        }
    }

    boolean contains(int value)
    {
        Node current = this;
        while(current!=null){
            if(current.data==value){
                return true;
            }else if(value<data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }

    void inorder()
    {
        if(left!=null)
            left.inorder();
        System.out.println(data);
        if(right!=null)
            right.inorder();
    }
}
