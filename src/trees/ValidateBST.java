package trees;

/**
 * @author mchitrashekar
 */
public class ValidateBST {
    public static boolean validateBst(BstConstruction.BST tree) {
        return validate(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validate(BstConstruction.BST tree, int min, int max) {
        if(tree.value< min || tree.value>max)
         return false;
        if(tree.left!=null && !validate(tree.left,min,tree.value))
        {
            return false;
        }
        if(tree.right!=null && !validate(tree.right,tree.value,max))
        {
            return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        BstConstruction.BST test = new BstConstruction.BST(10);
        test.insert(5).insert(15);
        System.out.println(validateBst(test));
    }
}
