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

        public int findClosestValueInBst(BST root, int target) {
            return findClosest(root, target, Double.MAX_VALUE);
        }

        private  int findClosest(BST root, int target, double closest) {
            if (Math.abs( target - root.value) < Math.abs(target - closest)) {
                closest = root.value;
            }
            if (target < root.value && root.left!=null) {
                    return findClosest(root.left, target, closest);
            } else if (target > root.value && root.right!=null) {
                    return findClosest(root.right, target, closest);
            } else {
                return (int)closest;
            }
        }
    }


    static BST root = new BST(10);
    BST test3 = new BST(10);

    public static void main(String args[]) {
        BST test = new BST(100);
        test
                .insert(5)
                .insert(15)
                .insert(5)
                .insert(2)
                .insert(1)
                .insert(22)
                .insert(1)
                .insert(1)
                .insert(3)
                .insert(1)
                .insert(1)
                .insert(502)
                .insert(55000)
                .insert(204)
                .insert(205)
                .insert(207)
                .insert(206)
                .insert(208)
                .insert(203)
                .insert(-51)
                .insert(-403)
                .insert(1001)
                .insert(57)
                .insert(60)
                .insert(4500);
        test.inorder();
        System.out.println(test.findClosestValueInBst(test,-70));
    }
}
