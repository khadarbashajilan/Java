public class Largest&Smallestinarray
{
    public static int getLarg_Small(int num[])
    {
        int Largest = Integer.MIN_VALUE;  //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i = 0; i < num.length; i++)
        {
            if(Largest<num[i])
            {
                Largest = num[i];
            }
            if(smallest>num[i])
            {
                smallest  = num[i];
            }
        }
        System.out.println("The smallest is "+smallest);
        return Largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,5};
        
        System.out.println("The largest is "+getLarg_Small(num));
        
    }
}