public class sub_string {
    public static void main(String[] args) {
        String str = "Helloworld";
        int si = 0;
        int ei = 5;
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        System.out.println(substr);
        /* or */
        System.out.println(str.substring(0, 5));  //->inbuilt function
    }
}
