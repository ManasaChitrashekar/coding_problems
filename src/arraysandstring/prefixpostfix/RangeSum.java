package arraysandstring.prefixpostfix;
//Since pattern is prefix postfix i blindly calauclted both prefix and postfix and tried to subrtact
//didnt carefully look in the range nand analyse i need only prefix
//[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
//https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSum {
    int pre[];
    public RangeSum(int[] nums) {
        //calculate prefix
        pre = new int[nums.length];
        pre[0]=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            pre[i]= pre[i-1]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left-1<0)
            return pre[right];
        else
            return pre[right]-pre[left-1];
    }
}
