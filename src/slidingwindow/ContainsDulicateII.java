package slidingwindow;

import java.util.HashSet;
import java.util.Set;

/**
 * THIS WAS GOOD PROBLEM TO SOLEVE
 * USE SLIDE WINDOW BECAUSE K IS GIVEN AND ASKING CONDITION IN RANGE
 * TEHY ARE ASKING WE NEED TO FIND DISTNICT SO WE NEEED TO USE HASHSET
 * THE CONDITION J-I<=K WAS TRICKY HERE THIS MEANS WINDOWN SIZE IS ACTUALLY K+1;
 */
public class ContainsDulicateII {

    public static void main(String[] args) {
        System.out.println(ContainsDulicateII.containsNearbyDuplicate(new int[]{0,1,2,3,2,5},3));
        System.out.println(ContainsDulicateII.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
        System.out.println(ContainsDulicateII.containsNearbyDuplicate(new int[]{1,0,1,1},1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i =0,j=0;
        Set<Integer> window = new HashSet<>();
        while(j<nums.length)
        {
            if(j-i>k)
            {
                window.remove(nums[i]);
                i++;
            }
            if((j-i)<=k)
            {
                if(window.contains(nums[j])) return true;
                window.add(nums[j]);
            }
            j++;

        }
        return false;
    }
}
