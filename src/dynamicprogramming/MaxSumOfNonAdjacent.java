package dynamicprogramming;

/**
 * @author mchitrashekar
 */
public class MaxSumOfNonAdjacent {
    public static void main(String args[])
    {
        int[] inPutArr = {125,21,250,120,150,300};
        System.out.println(maxSubsetSumNoAdjacent(inPutArr));
    }

    public static int maxSubsetSumNoAdjacent(int[] array) {
       if(array.length==0)
           return 0;
       if(array.length ==1)
           return array[0];
       else{
           int first = array[0];
           int second = Math.max(array[1],array[0]);
           int cur =0;
           for(int i = 2; i < array.length;i++)
           {
               cur = Math.max(second,first+array[i]);
               first = second;
               second = cur;
           }
           return cur;
       }
    }
}
