public class Javamath
{
    public static void main(String[] args)
    {
        double x = 10;
        double y = 5;

        //return the maximum value of given numbers
        System.out.println("Max number of x and y is "+Math.max(x,y));

        //returns the square root of y
        System.out.println("Square root of y is "+Math.sqrt(y));

        //returns x power of y
        System.out.println("Power of x to the y is : "+Math.pow(x,y));

        //returns the logarithm of given value 
        System.out.println("Logarithm of x is "+Math.log(x));
        System.out.println("Logarithm of y is "+Math.log(y));

        //return log of x+1
        System.out.println("log1p of x is : "+Math.log1p(x));

        //returns the power of 2
        System.out.println("exp of x is : "+Math.exp(x));

        //returns (a power of 2)-1
        System.out.println("expm1 of x is : "+Math.expm1(x));

    }
}