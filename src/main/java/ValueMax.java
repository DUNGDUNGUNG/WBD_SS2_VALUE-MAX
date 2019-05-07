import java.util.Scanner;

public class ValueMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("Enter a size the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Property list : ");
        for (int i : array) {
            System.out.print(i + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index += i;
            }
        }

        System.out.println("\n The largest property value in the list is " + max + ", at position " + index);
    }
}
