package sorting;

/**
 * @author mchitrashekar
 */
public class InsertionSort {
    public static void main(String args[])
    {
        int[] sortedArray = insertionSort(new int[]{5,4,3,2,1});
        for(int i : sortedArray)
        {
            System.out.println(i);
        }
    }

    private static int[] insertionSort(int[] array) {
        for(int i =0 ; i<=(array.length-1);i++)
        {
            int j =i;
            while(j>0 && array[j-1]>array[j])
            {
                //swap
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        return array;
    }
}
