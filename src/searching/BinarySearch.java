package searching;

/**
 *
 * @author mchitrashekar
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        int mid = 0;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(target==array[mid])
                return mid;
            if(target<array[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String args[])
    {
        int[] array = new int[] {1,5,23,111};
        System.out.println(binarySearch(array,111));
    }
}
