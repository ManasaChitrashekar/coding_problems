package arraysandstring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mchitrashekar
 */
public class CipherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
      if(key==0)
          return str;
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray())
        {
            char ch = (char)(((int)c+
                    key - 65) % 26 + 65);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main (String args[])
    {
        System.out.println(caesarCypherEncryptor("xyz",3));
    }
}
