package searching;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {


        //find max from piles so we have k which can range from 1 to max one pile rate
        Arrays.sort(piles);
        int max = piles[piles.length-1];
        int k = h;
        int low = 1,high = max;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int res =0;
            for(int i =0;i<piles.length;i++)
            {
                res+=  Math.ceil((double)piles[i]/mid);
            }
            if(res<=h)
            {
                k = mid;
                high = mid -1;
            }
            else
            {
                low = mid+1;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(KokoEatingBananas.minEatingSpeed(new int[]{1,4,3,2},9));
        System.out.println(KokoEatingBananas.minEatingSpeed(new int[]{25,10,23,4},4));
    }
}
