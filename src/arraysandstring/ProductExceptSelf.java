package arraysandstring;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int cur = 1;
        for(int i = 0;i<nums.length;i++)
        {
            res[i] = cur * nums[i];
            cur = cur * nums[i];
        }

        cur =1;
        for(int i = nums.length-1;i>0;i--)
        {
            res[i] = cur * res[i-1];
            cur = cur * nums[i];
        }
        res[0]=cur;
        return res;

    }

    public static void main(String args[])
    {
        int[] ip = new int[]{1,2,4,6};
        System.out.println(ProductExceptSelf.productExceptSelf(ip));

        //failed case
        ip = new int[]{-1,1,0,-3,3};
        System.out.println(ProductExceptSelf.productExceptSelf(ip));
    }
}
