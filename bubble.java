import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++){
            System.out.print("Enter number for " + i + " index:");
            myArray[i] = scanner.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(myArray));

        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(myArray)));

    }
    public static int[] bubbleSort(int[] myArray) {
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < (myArray.length - i); j++) {
                if (myArray[j - 1] > myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }
}
