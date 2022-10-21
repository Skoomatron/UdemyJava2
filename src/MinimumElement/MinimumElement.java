package MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int myElements = readInteger();
        int[] myArray = readElements(myElements);
        System.out.println("Your numbers are " + Arrays.toString(myArray));
        System.out.println("The minimum value is " + findMin(myArray));
    }
    private static int readInteger() {
        System.out.println("Enter the size of your number pool: ");
        int elements = scanner.nextInt();
        return elements;
    }
    private static int[] readElements(int size) {
        int[] myArray = new int[size];
        System.out.println("Please enter " + size + " numbers.");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myArray;
    }

    private static int findMin(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < temp) {
                temp = array[i];
            }
        }
        return temp;
    }
}
