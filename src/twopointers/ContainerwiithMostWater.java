package twopointers;

/**
 * I was able to solve this problem using two pointer. The only mistake i madse was calculating are , I made r-l+1
 * while visulaising but it is supposed to be just r-l
 * The idea of this problem is we move the container based on which is maximum assuming holding on to heigher container
 * gives most value
 */
public class ContainerwiithMostWater {
    public static int maxArea(int[] heights) {
        int maxArea = 0;
        int left =0,right=heights.length-1;
        while(left<right)
        {
            int length = Math.min(heights[left],heights[right]);
            int breadth= right-left;
            maxArea = Math.max(maxArea,(length*breadth));
            if(heights[left]<heights[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }

    public static void main(String args[])
    {
        System.out.println(ContainerwiithMostWater.maxArea(new int[]{1,7,2,5,4,7,3,6}));
    }
}
