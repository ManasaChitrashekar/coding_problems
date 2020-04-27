package sorting;

import java.util.Arrays;

/**

 * @author mchitrashekar
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length-1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
        }
        return array;
    }

    public static void main(String args[]){
        int array[] = new int[] {1};
        Arrays.stream(array).forEach(value -> System.out.println(value));
        bubbleSort(array);
        System.out.println("-----------------------------------");
        Arrays.stream(array).forEach(value -> System.out.println(value));
    }

}
