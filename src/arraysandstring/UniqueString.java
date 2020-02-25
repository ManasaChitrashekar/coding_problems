package arraysandstring;

/**
 * Check if string is unique
 */
public class UniqueString {
    public static void main(String args[])
    {
        String abc = "is the inclusive OR operator. |= assigns the result of an inclusive OR operation to the indicated variable. << is the left shift bitwise operator. It will shift binary data \"to the left\" by the indicated number of bits.\n"
                + "\n"
                + "Line 11 is assigning the result of an inclusive OR operation, namely left shifting the number 1 left by val number of bits.";
        System.out.println(isUnique(abc));
    }

    private static boolean isUnique(String string) {
        boolean[] charSet =new boolean[256];
        if(string.length()>128)
            return false;
        for(char c: string.toLowerCase().toCharArray()){
            if(charSet[c])
                return false;
            charSet[c]=true;
        }
        return true;
    }
}
