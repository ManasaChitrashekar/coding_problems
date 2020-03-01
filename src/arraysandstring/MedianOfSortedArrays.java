package arraysandstring;

public class MedianOfSortedArrays {
    public static void main(String args[]){
        int[] array1 = new int[]{1,2,3,4,5,6};
        int[] array2 = new int[]{7,8,9,10,11,12};
        System.out.println(median(array1,array2,0,array1.length-1,0,array2.length-1));

    }

    private static double median(int[] array1, int[] array2, int starta, int enda, int startb, int endb) {
        if((enda - starta == 1) && (endb - startb ==1))
        {

            return Math.ceil(1.0*(Math.max(array1[starta], array2[startb]) + Math.min(array1[enda], array2[endb])))/2;
        }

        int m1Index = (enda +starta)/2;
        int m2Index = (endb + startb)/2;

        int m1 = array1[m1Index];
        int m2 = array2[m2Index];

        if(m1 == m2)
            return m2;
        if(m1 < m2)
        {
            starta = m1Index;
            endb = m2Index;
        }

        else{
            enda = m1Index;
            startb= m2Index;
        }

        return median(array1,array2,starta,enda,startb,endb);
    }
}
