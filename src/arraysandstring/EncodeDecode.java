package arraysandstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {

    public static String encode(List<String> strs) {
        StringBuilder es = new StringBuilder();
        for(String s: strs)
        {
           es.append(s.length()+"#"+s);
        }

        return es.toString();

    }

    public static List<String> decode(String str) {
        List<String> resultList = new ArrayList<>();

        int i=0;
        while(i<str.length())
        {
            int j =i;
            StringBuilder count = new StringBuilder();
            while(str.charAt(j)!='#')
            {
                count = count.append(str.charAt(i));
                j++;
            }
            int length= Integer.parseInt(str.substring(i,j));
            i=j+1+length;
            resultList.add(str.substring(j+1,i));

        }
        return resultList;
    }

    public static void main(String args[])
    {
        String[] input = new String[]{"we","say",":","yes","!@#$%^&*()"};
        String en = encode(Arrays.asList(input));
        List<String> output = decode(en);
        System.out.println(output);
    }
}
