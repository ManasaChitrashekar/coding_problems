package arraysandstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mchitrashekar
 */
public class ThreeSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(array);
        for(int i =0;i<array.length;i++)
       {
           int low = i+1;
           int high = array.length-1;
           while(low<high)
           {
               int sum = array[i]+array[low]+array[high];
               if(sum == targetSum)
               {
                   output.add(new Integer[]{array[i],array[low],array[high]});
                   low++;
                   high--;
               }
               else if(sum<targetSum)
                   low++;
               else
                   high--;
           }
       }
        return output;
    }
    public static  void main(String args[])
    {
        List<Integer[]> output = threeNumberSum(new int[] {1,2,3}, 6);
       System.out.println(output);
    }
}
