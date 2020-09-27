package arraysandstring;

public class MoveElementToEnd {
    public static void main(String args[])
    {
        int[] array = new int[] {2, 1, 2, 2, 2, 3, 4, 2};
        // 2,7,3,4,1,5,1,1
        //
        moveElemntToEnd(array,1);
    }

    private static void moveElemntToEnd(int[] array, int elementToMove) {
        int i = 0;
        int j = array.length-1;
        while(i<j)
        {
            if(array[i]==elementToMove && array[j]!=elementToMove)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j]=temp;
                i++;
                j--;
            }
            else if(array[j]==elementToMove)
            {
                j--;
            }
            else if(array[i]!=elementToMove)
            {
                i++;
            }
        }
        for(int ele :array)
        {
            System.out.println(ele);
        }
    }
}
