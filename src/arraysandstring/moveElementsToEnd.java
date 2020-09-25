package arraysandstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mchitrashekar
 */
public class moveElementsToEnd {
    public static void main(String args[])
    {
        List<Integer> array = new ArrayList<>();
        array.add(2);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);
        System.out.println(moveElementsToEndHelper(array ,2));
    }

    private static List<Integer> moveElementsToEndHelper(List<Integer> arrayList, int toMove) {
       int[] array = new int [arrayList.size()];
       for(int p=0;p<=arrayList.size()-1;p++)
       {
           array[p] = arrayList.get(p);
       }
        int i = 0;
        int j= array.length-1;
        while(i<=j)
        {
            if(array[i]==toMove && array[j]!=toMove)
            {
                int temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
            if(array[i]!=toMove)
                i++;
            if(array[j]==toMove)
                j--;
        }
        List<Integer> converterList = new ArrayList<>();
        for(int obj:array)
        {
            converterList.add(obj);
        }

        return converterList;
    }
}
