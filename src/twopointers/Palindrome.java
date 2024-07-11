package twopointers;

public class Palindrome {

   /*
   Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.
    */
   public static boolean isPalindrome(String s) {
       //convert to lower case
       if(s.length()==0 || s.equals(" "))
           return true;
       int left=0;
       int right=s.length()-1;
       while(left<=right)
       {
           if(!Character.isLetterOrDigit(s.charAt(left)))
           {
               left++;
               continue;
           }

           if(!Character.isLetterOrDigit(s.charAt(right)))
           {
               right--;
               continue;
           }
           if(Character.toLowerCase(s.charAt(left)) !=   Character.toLowerCase(s.charAt(right)))
               return false;
           left++;
           right--;
       }

       return true;
   }

   public static void main(String args[])
   {
       System.out.println(Palindrome.isPalindrome( " "));
   }

}
