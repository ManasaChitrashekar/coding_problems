package hashTable;

/**
 * @author mchitrashekar
 */
public class StringPermutation {

    public static void main (String args[])
    {
        String s1 = "My gym";
        String s2 = "yMg ym";
        System.out.println(isPermutation(s1,s2));
    }

    private static boolean isPermutation(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        int[] s1Array = new int[128];
        for(char c :s1.toCharArray())
        {
            s1Array[c]++;
        }
        for(char c :s2.toCharArray())
        {
            s1Array[c]--;
            if( s1Array[c]<0)
                return false;
        }
        return true;
    }
}
