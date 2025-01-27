public class Traping_Rainwater {
    public static int Trappedwater(int height[])
    {
        int n = height.length;

        //calculate left max boundary

        int leftmax[] = new int[n];
        leftmax[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i]=Math.max(height[i], leftmax[i-1]); //4,4,4,6,6,6,6
        }
        //calculate right max boundary

        int rightmax[]  = new int[n];
        rightmax[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightmax[i]=Math.max(height[i], rightmax[i+1]);//5,5,5,6,6,6,6,
                                                                //6,6,6,6,5,5,5
        }
        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++)
        {
            //waterlevel = waterlevel-height[i]
            int waterlevel = Math.min(leftmax[i], rightmax[i]);//4,4,4,6,5,5,5

            //trappedwater = waterlevel - height[i]
            trappedwater+=waterlevel-height[i];//0 + 2 + 4 + 0 + 2 + 3 + 0 = 11
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Trappedwater(height));
    }
}
