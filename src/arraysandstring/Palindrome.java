package arraysandstring;

public class Palindrome {

    public static void main(String args[])
    {
        System.out.println(Palindrome.checkPalindrome("aba"));
    }

    private static boolean checkPalindrome(String str) {
        if(str== null || str.length()<=1)
            return true;

        int start = 0;
        int last = str.length()-1;
        while(start<=last)
        {
            if(str.charAt(start)!=str.charAt(last))
                return false;
            else
            {
                start++;
                last--;
            }
        }
        return true;

    }
}
