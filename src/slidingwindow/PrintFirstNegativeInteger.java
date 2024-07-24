package slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://www.geeksforgeeks.org/first-negative-integer-every-window-size-k/
 */
public class PrintFirstNegativeInteger {

    static void printFirstNegativeInteger(int arr[], int n, int k)
    {
        boolean found = false;
        int i =0,cur=0;
        List<Integer> negativeNumber = new ArrayList<>();
        Queue<Integer> negativeBucket = new LinkedList<>();
        for(int j=0;j<n;j++)
        {
           if(arr[j]<0)
               negativeBucket.add(arr[j]);
            if((j-i+1)==k)
            {
                if(negativeBucket.size()!=0 && negativeBucket.peek()<0)
                {
                    negativeNumber.add(negativeBucket.peek());
                }
                else
                {
                    negativeNumber.add(0);
                }
                if(negativeBucket.size()!=0 && arr[i]==negativeBucket.peek())
                {
                    negativeBucket.remove();
                }
                i++;
            }

            System.out.println(negativeNumber);
        }

    }
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        printFirstNegativeInteger(arr, n, k);
    }
}
