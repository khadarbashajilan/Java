public class iamweakinmath
{
    // public static void main(String args[])
    // {
    // int n=101;
    // int x= 10%10;
    // System.out.print(x);
    // public static void main(String[] args) {
    //     int i;
    //     int x = Math.min(6,6);
    //     System.out.print(x);
    // }
    public static void main(String[] args) {
        int arr[]={6,3,3,1,4};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest,arr[i]);
        }
           
            int count[] = new int[largest+1];
            for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
    }
for (int i = 0; i < arr.length; i++) {
    System.out.println(count[i]);
    
}}
}

        
        
