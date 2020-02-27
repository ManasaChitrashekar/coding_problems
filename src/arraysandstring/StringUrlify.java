package arraysandstring;

import java.util.Arrays;

/**
 * [[REPLACE WITH SHORT FILE DESC AND UPDATE WITH ADDITIONAL AUTHORS IF APPLICABLE]]
 * <p/>
 * Created on Feb 27, 2020
 * <br/>
 * Copyright 2020 Cedar CX Technologies
 * <br/>
 *
 * @author mchitrashekar
 */
public class StringUrlify {
    public static void main(String args[])
    {
        String url = "A                  hidden field let web developers include data that cannot be seen or modified by users when a form is submitted.";
        System.out.println(urlify(url));


    }

    private static String urlify(String url) {
        String s = url.trim();
        String[] sArray = url.split("\\s");
        //alternate solution
//        StringBuilder sb = new StringBuilder();
//        Arrays.stream(sArray).forEach(s1 ->
//                sb.append(s1+"%20"));
//        System.out.println(sb.toString().substring(0,sb.length()-3).equals(s.replaceAll("\\s","%20")));
        return s.replaceAll("\\s","%20");
    }
}
