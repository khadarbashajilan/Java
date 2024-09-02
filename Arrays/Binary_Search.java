public class Binary_Search {
    public static int BinarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] > key) {// left
                end = mid - 1;

            } else {// right
                start = mid + 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 12;

        int x = BinarySearch(num, key);
        if (x == -1) {
            System.out.println("Key is not found");

        } else {
            System.out.println("Index for key is " + x);
        }
    }
}