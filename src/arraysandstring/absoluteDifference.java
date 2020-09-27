package arraysandstring;

import java.util.Arrays;

public class absoluteDifference {
    public static void main(String args[])
    {
        int[] arrayOne = new int[]{-1, 5, 10, 20, 28, 3};
        int[] arrayTwo =  new int[] {26, 134, 135, 15, 17};
        int[] absDiff =absoluteHelper(arrayOne,arrayTwo);
        System.out.println(absDiff[0]+","+absDiff[1]);

    }

    static int[] absoluteHelper(int[] arrayOne, int[] arrayTwo)
    {
        //sort arrays;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int i =0 ,j =0;
        int min = Math.abs(arrayOne[i]-arrayTwo[j]);
        int arrayOneValue = arrayOne[i],arrayTwoValue = arrayTwo[j];
        while((i<arrayOne.length)&&(j<arrayTwo.length))
        {
            if(Math.abs(arrayOne[i]-arrayTwo[j])<min)
            {
                min =  Math.abs(arrayOne[i]-arrayTwo[j]);
                arrayOneValue = arrayOne[i];
                arrayTwoValue = arrayTwo[j];
            }
            if(min == 0 )
            {
                return new int[]{arrayOne[i],arrayTwo[j]};
            }
            if(arrayOne[i]<arrayTwo[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
        return new int[]{arrayOneValue,arrayTwoValue};
    }

}
