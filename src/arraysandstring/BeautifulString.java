package arraysandstring;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * [[REPLACE WITH SHORT FILE DESC AND UPDATE WITH ADDITIONAL AUTHORS IF APPLICABLE]]
 * <p/>
 * Created on Aug 30, 2020
 * <br/>
 * Copyright 2020 Cedar CX Technologies
 * <br/>
 *
 * @author mchitrashekar
 */
public class BeautifulString {

    public static void main(String args[]){
        System.out.println(BeautifulString.isBeautifulString("bbbaacdafe"));
    }

    static boolean isBeautifulString(String inputString) {
        if(inputString== null || inputString.isEmpty())
            return true;

        char[] inputArray = inputString.toCharArray();
        //Set<Character> uniqueChar = new HashSet<String>();
        Map<Character,Integer> lookUp = new LinkedHashMap<>();
        for(int i=0; i<inputArray.length; i++)
        {
            if(lookUp.get(Character.valueOf(inputArray[i]))==null)
            {
                lookUp.put(inputArray[i], 1);
            }
            else
            {
                lookUp.put(inputArray[i], lookUp.get(inputArray[i])+1);
            }
        }
        int count =Integer.MAX_VALUE;
        List<Integer> values = new ArrayList<>(lookUp.values());
        for(int i = 0;i< values.size();i++){
            if(values.get(i)<= count)
            {
                count = values.get(i);
            }
            else{
                return false;
            }
        }

        return true;

    }
}
