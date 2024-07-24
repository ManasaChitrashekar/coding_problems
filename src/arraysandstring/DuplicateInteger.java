package arraysandstring;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        Set uniqSet = new HashSet<Integer>();
        for(int i =0;i<nums.length;i++)
        {
            if(uniqSet.contains(nums[i]))
                return true;
            uniqSet.add(nums[i]);
        }
        return false;
    }
}
