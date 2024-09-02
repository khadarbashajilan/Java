import java.util.*;
public class vowels_instring
{
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
   
        System.out.print("Enter a word : ");
        String  z = xyz.nextLine();
        int count = 0;
   
        for (int i = 0; i < z.length(); i++) {
            char ch = z.charAt(i);
            if(ch == 'a' || ch == 'i' || ch=='o' || ch == 'u' ||ch == 'e')
            {
                count++;
            }
            
        }
        System.out.println(count);
        
    }   

}
