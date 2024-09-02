public class Uppercase {
    public static String toUppercase(String str)
    {
        StringBuilder ab = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        ab.append(ch);

        for(int i=1; i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                ab.append(str.charAt(i));  //-> similsr to System.out.println(ab);
                
                i++;
                ab.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                ab.append(str.charAt(i));
            }
        }
        return ab.toString();    }
        public static void main(String[] args) {
            String STR = "hi, i am thor ";
            System.out.println(toUppercase(STR));
        }
}
