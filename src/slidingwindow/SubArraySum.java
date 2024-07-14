package slidingwindow;

/**
 * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
 * WINDOW SIZE = j-i+1 = k
 *
 */
public class SubArraySum {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int res =0;
        int i=0,j =0,sum=0;
        while(j<arr.length)
        {
            sum=sum+arr[j];
            if((j-i+1<k))
            {
               j++;
            }
            else if(j-i+1==k)
            {
                if((sum/k)>=threshold) res++;
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        System.out.println(SubArraySum.numOfSubarrays(new int[]{2,2,2,2,5,5,5,8},3,4));
        System.out.println(SubArraySum.numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3},3,5));
    }
}
