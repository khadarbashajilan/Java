public class Sum_of_Secondrow {
    public static void main(String[] args) {
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            sum+=nums[1][i];
        }
        System.out.println("Sum is "+sum);
    }
}
