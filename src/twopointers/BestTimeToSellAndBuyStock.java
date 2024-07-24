package twopointers;


/**
 * This is two pointer problem ,  I can buy today but only sell future .
 * To get max profit we should buy low sell high
 * We have two pointers left and right right always advanaces
 * l =0 r=1;
 * we compar prices if it gives positve prof we calculote max
 * else that price doesnt yeild profit so no point in holding on to it and move both left and right
 * left moves only when no profit right always advance to check if we can compare left and righ to acheive max profit
 */
public class BestTimeToSellAndBuyStock {
    public static int maxProfit(int[] prices) {
        int profit =0;
        int l =0;
        for(int r =1;r<prices.length;r++)//r always advances
        {
            if(prices[l]<prices[r])
            {
                profit = Math.max(prices[r]-prices[l],profit);
            }
            else
            {
                //left doesnt give profit so move it to where right is as we covered all proces between these two points
                l=r;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(BestTimeToSellAndBuyStock.maxProfit(new int[]{10,1,5,6,7,1}));
    }

}
