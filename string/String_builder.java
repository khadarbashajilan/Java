public class String_builder {
    public static void main(String[] args) {
        StringBuilder xy=new StringBuilder("");
        for (char ch='a'; ch<='z';ch++) 
        {
            xy.append(ch);     
        }
        System.out.println(xy);
        System.out.println(xy.length());
    }
}
