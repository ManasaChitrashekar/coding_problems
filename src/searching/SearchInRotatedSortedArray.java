package searching;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            //check if target is mid
            if(nums[mid]==target)
                return mid;
            //check which part of array is properly sorted nums[l]<nums[mid] - left sorted else right
            if(nums[l]<nums[mid])
            {
                //if sorted elenet exists in range and we move high
                if(nums[l]<=target && target<=nums[mid])
                {
                    h = mid-1;
                }
                else
                {
                    l = mid+1;
                }

            }
            else
            {
                //if sorted elenet exists in range and we move low
                if(nums[mid]<=target && target<=nums[h])
                {
                    l = mid+1;
                }
                else
                {
                    h = mid-1;
                }
            }
        }
        return -1;
    }
}
