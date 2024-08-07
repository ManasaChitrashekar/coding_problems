package searching;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int min =nums[0];
        int low = 0,high =nums.length-1;
        while(low<=high)
        {
            if(nums[low]>nums[low+1] )
                return nums[low+1];
            else if ( nums[high]<nums[high-1])
                return nums[high];
            else
            {
                low++;
                    high--;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,6,1,2}));
        System.out.println(findMin(new int[]{4,5,0,1,2,3}));
        System.out.println(findMin(new int[]{4,5,6,7}));
    }

}
