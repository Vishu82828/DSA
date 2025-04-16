public class reverseArray {
    public static void reverse(int[] num) {
        int start = 0, end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++; // Move start forward
            end--;   // Move end backward
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(num);
        
        System.out.print("Reversed Array: ");
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}