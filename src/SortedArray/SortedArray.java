package SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int size) {

        int[] myArray = new int[size];
        System.out.println("Please input " + size + " numbers.");

        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static void printArray(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
