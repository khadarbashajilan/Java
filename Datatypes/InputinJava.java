import java.util.*;

public class InputinJava {
    public static void main( String args[]){

        Scanner abc = new Scanner (System.in);
        System.out.println("Enter a word: ");
        String input = abc.next();
        System.out.println(input);

        Scanner def = new Scanner (System.in);
        System.out.println("Enter a sentence: ");
        String input1 = def.nextLine();
        System.out.println(input1);

        Scanner ghi = new Scanner (System.in);
        System.out.println("Enter a integer: ");
        int num = ghi.nextInt();
        System.out.println(num);

        Scanner jkl = new Scanner (System.in);
        System.out.println("Enter a floating number: ");
        float num1 = jkl.nextFloat();
        System.out.println(num1);

        Scanner mno = new Scanner (System.in);
        System.out.println("Enter a boolean: ");
        boolean what = mno.nextBoolean();
        System.out.println(what);

    }
}