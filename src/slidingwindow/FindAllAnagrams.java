package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> anIndex = new ArrayList<>();
        Map<Character,Integer> sCount = new HashMap<>();
        Map<Character,Integer> pCount = new HashMap<>();
        for(int i =0;i<p.length();i++)
        {
            pCount.put(p.charAt(i),pCount.getOrDefault(p.charAt(i),0)+1);
        }

        int i=0,k=p.length();
        for(int j=0;j<s.length();j++)
        {
            sCount.put(s.charAt(j),sCount.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1==k)
            {
                if(sCount.equals(pCount))
                {
                    anIndex.add(i);
                }
                if(sCount.get(s.charAt(i))!=null)
                {
                    sCount.put(s.charAt(i),sCount.get(s.charAt(i))-1);
                    if(sCount.get(s.charAt(i))==0)
                        sCount.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return anIndex;


    }
    public static void main(String[] args) {
        System.out.println(FindAllAnagrams.findAnagrams("cbaebabacd","abc"));
    }
}
