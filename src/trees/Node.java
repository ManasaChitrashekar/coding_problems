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
        boolean found = false;
        if(value == data)
            found = true;
        if(value<= data)
        {
            if(left== null)
                found=  false;
            else
                left.contains(value);
        }
        else
        {
            if(right == null)
                found= false;
            else
                right.contains(value);
        }

        return found;
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
