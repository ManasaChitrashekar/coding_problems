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
        Map<Character,Character> lookUpTable = new HashMap();
        char[] valueArray = new char[26];
        for(int i = 0;i< valueArray.length;i++)
        {
            valueArray[i] = (char) (97+i);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray())
        {
           int shiftChar = (c-97)+ key;
           if(shiftChar<= 25)
            sb.append(valueArray[shiftChar]);
           else
               sb.append(valueArray[key % 25]);
        }
        return sb.toString();
    }

    public static void main (String args[])
    {
        System.out.println(caesarCypherEncryptor("xyz",3));
    }
}
