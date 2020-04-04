package arraysandstring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mchitrashekar
 */
public class TwoSum {
    public static void main (String args[])
    {
     //int[] output = twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 15);
        int[] output = twoNumberSum3(new int[] {4, 6, 1}, 5);
        System.out.println(output[0]+","+output[1]);
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] expected = {};
        if (array.length < 2)
            return expected;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (targetSum - array[i] == array[j])
                        return new int[] {array[i], array[j]};
                }
            }
        }
        return expected;
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        int[] expected = {};
        if (array.length < 2)
            return expected;
       Map<Integer,Boolean> lookupTable = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(lookupTable.get(targetSum-array[i])!=null)
                return new int[] {array[i],targetSum-array[i]};
            else
                lookupTable.put(array[i],true);
        }
        return expected;
    }

    public static int[] twoNumberSum3(int[] array, int targetSum) {
        int[] expected = {};
        if (array.length < 2)
            return expected;
        Arrays.sort(array);
        int left = 0 , right = array.length-1;
        while(left<right)
        {
            int curSum = array[left]+array[right];
            if(curSum == targetSum)
                return new int[] {array[left],array[right]};
            else if(curSum<targetSum)
                left++;
            else
                right--;
        }
        return expected;
    }
}
