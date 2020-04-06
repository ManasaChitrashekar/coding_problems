package trees;

/**
 * @author mchitrashekar
 */
public class BstConstruction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else
                    left.insert(value);
            } else {
                if (right == null) {
                    right = new BST(value);
                } else
                    right.insert(value);
            }
            return this;
        }

        public boolean contains(int value) {
            if (this.value == value)
                return true;
            else if (value < this.value) {
                if (left == null) {
                    return false;
                } else
                    return left.contains(value);
            } else {
                if (right == null) {
                    return false;
                } else
                    return right.contains(value);
            }
        }

        public BST remove(int value) {
            return deleteNode(this, value);


        }

        private BST deleteNode(BST root, int key) {
            if (root == null)
                return null;
            if (key < root.value) {
                root.left = deleteNode(root.left, key);
            } else if (key > root.value) {
                root.right = deleteNode(root.right, key);
            } else {
                if (root.left == null)
                    return root.right;
                if (root.right == null)
                    return root.left;
                root.value = min(root.right);
                root.right = deleteNode(root.right, root.value);

            }
            // Write your code here.
            // Do not edit the return statement of this method.
            return root;
        }

        private int min(BST root) {
            while (root.left != null) {
                root = root.left;
            }
            return root.value;
        }

        void inorder() {
            if (left != null)
                left.inorder();
            System.out.println(value);
            if (right != null)
                right.inorder();
        }
    }


    static BST root = new BST(10);
    BST test3 = new BST(10);

    public static void main(String args[]) {
        root.insert(15).insert(11).insert(22);
        root.inorder();
        root = root.remove(10);
        root.inorder();
        //  System.out.println(root.contains(10));
        BST test3 = new BST(10);
        test3 = test3.insert(5).insert(7).insert(2).remove(10);
        //  System.out.println(root.contains(10));
        test3.inorder();
    }
}
