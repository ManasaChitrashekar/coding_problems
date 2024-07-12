package stack;

import java.util.Stack;

/**
 * For every open bracket push items into stack
 * for every clos ebracket we get check if the top of stack has corresponding open bracket
 * if not rerun false i miseed adding else case in for which failed for input like '['
 */
public class ValidateParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray())
        {
            if(c=='('|| c=='{' || c=='[')
            {
                st.push(c);
            }
            else if(c==')' && !st.isEmpty() && st.peek()=='(')
            {
                st.pop();
            }
            else if(c==']' && !st.isEmpty() && st.peek()=='[')
            {
                st.pop();
            }
            else if(c=='}' && !st.isEmpty() && st.peek()=='{')
            {
                st.pop();
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        System.out.println(ValidateParentheses.isValid("([{}])"));
    }
}
