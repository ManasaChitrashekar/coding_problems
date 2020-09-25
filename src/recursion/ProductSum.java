package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mchitrashekar
 */
public class ProductSum {

    public static void main(String args[])
    {
        List<Object> specialArray = new ArrayList<>();
        specialArray.add(5);
        specialArray.add(2);
        List<Integer> list1 = new ArrayList();
        list1.add(7);
        list1.add(-1);
        specialArray.add(list1);
        System.out.println(productSumHelper(specialArray,1));
    }

    private static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for(Object obj : array)
        {
            if(obj instanceof ArrayList)
            {
                sum = sum + productSumHelper((ArrayList<Object>) obj,multiplier+1);
            }
            else
            {
                sum = sum + ((Integer) obj).intValue();
            }
        }
        return sum*multiplier;
    }
}
