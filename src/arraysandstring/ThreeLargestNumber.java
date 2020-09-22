package arraysandstring;

public class ThreeLargestNumber {
    public static void main(String args[])
    {
        int[] threeLargest = ThreeLargestNumber.findLargestThree();
        System.out.println(threeLargest[0]+threeLargest[1]+threeLargest[2]);
    }

    private static int[] findLargestThree() {
        int[] threeLagest = new int[3];
        threeLagest[0] = Integer.MIN_VALUE;
        threeLagest[1]=Integer.MIN_VALUE;
        threeLagest[2] = Integer.MIN_VALUE;
        int[] input = new int[] {141,1,17,-7,-27,18,541,8,7,8,7,7};
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>threeLagest[2])
            {
                threeLagest[0] = threeLagest[1];
                threeLagest[1] = threeLagest[2];
                threeLagest[2] = input[i];
            }
            else if(input[i]>threeLagest[1])
            {
                threeLagest[0] = threeLagest[1];
                threeLagest[1] = input[i];
            }
            else if(input[i]>threeLagest[0])
            {
                threeLagest[0] = input[i];
            }

        }
        return threeLagest;
    }
}
