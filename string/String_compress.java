import java.util.*;

public class String_compress

{
    public static String compress(String str) {
        StringBuilder xz = new StringBuilder("");
        // String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }
            xz.append(str.charAt(i));
            // newstr+=str.charAt(i);
            if (count > 1) {
                xz.append(count.toString());
                // newstr+=count.toString();
            }
        }
        return xz.toString();
        // return newstr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccd";
        System.out.println(compress(str));
    }
}