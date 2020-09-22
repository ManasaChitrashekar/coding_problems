package sorting;

/**
 * @author mchitrashekar
 */
public class SelectionSort {
    public static void main(String args[])
    {
        int[] sortedArray = selectionSort(new int[]{5,4,3,2,1});
        for(int i : sortedArray)
        {
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] array) {
        for(int i =0 ;i<=array.length-1;i++)
        {
            int min =i;
            for(int j=i+1;j<=array.length-1;j++)
            {
                    if(array[min]>array[j])
                    {
                       min = j;
                    }
            }
            if(min !=i){
                //swap
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }
        return array;
    }
}
