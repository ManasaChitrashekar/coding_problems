package slidingwindow;

public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int min =Integer.MAX_VALUE,sum=0;
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(sum<target)
            {
                sum = sum+nums[j];
            }
            while(sum>=target)
            {
                min =Math.min(min,j-i+1);
                sum=sum-nums[i];
                i++;

            }

        }
        if(min!=Integer.MAX_VALUE)
            return min;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(MinSubArrayLen.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}
