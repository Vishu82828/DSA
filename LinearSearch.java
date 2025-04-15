import java.util.*;

public class LinearSearch {
    public static int linearSearch(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // Allow dynamic array creation

        int number[] = new int[n]; // Allocate array dynamically

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int index = linearSearch(number, key);

        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }

        sc.close();
    }
}