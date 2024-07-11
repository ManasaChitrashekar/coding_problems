package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mchitrashekar
 * I read question but didnt ask if array can be sorted ? In question its given no duplicates
 * that is the hint to sort array
 */
public class ThreeSum {
    public static List<Integer[]> threeNumberSum(int[] array) {
        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(array);

        for(int i =0;i<array.length;i++)
       {
           if (i > 0 && array[i] == array[i - 1]) continue;
           int low = i+1;
           int high = array.length-1;
           while(low<high)
           {
               int sum =array[low]+array[high];
               int targetSum = array[i]*-1;
               if(sum == targetSum)
               {
                   output.add(new Integer[]{array[i],array[low],array[high]});
                   low++;
                   high--;
                   while(low<high && array[low]==array[low+1]) low++;
                   while(low<high && array[high]==array[high-1]) high--;
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
        List<Integer[]> output = threeNumberSum(new int[] {-1,0,1,2,-1,-4});
       System.out.println(output);
    }
}
