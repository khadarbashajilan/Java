public class MAXsubarray_brutforce {
    public static void printsubarray_sum(int num[])
    {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                cursum=0;
                for (int k = start; k <= end; k++) {
                    //printing sum of subarrays
                    cursum+=num[k];
                }
                System.out.println(cursum);
                if(maxsum<cursum)
                {
                    maxsum = cursum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        printsubarray_sum(num);

    }
    
}
