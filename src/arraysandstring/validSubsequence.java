package arraysandstring;

/**
 * @author mchitrashekar
 */
public class validSubsequence {
    public static void main(String args[]){
        int[] mainArray = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] subArray = {1, 6, -1, 10};

            String text = "ÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂÂ1455";
        System.out.println(text);
        System.out.println(text);
        System.out.println(isValidSubsequence(mainArray,subArray));


    }

    private static boolean isValidSubsequence(int[] main, int[] sub) {
        int subIndex = 0 , mainIndex = 0;
        while(subIndex < (sub.length) && mainIndex< (main.length) ){
            if(sub[subIndex] == main[mainIndex])
            {
                subIndex++;

            }
            mainIndex++;
        }
         return subIndex == sub.length;
    }
}
