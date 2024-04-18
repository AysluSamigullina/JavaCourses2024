import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        exercise3();
    }

    public static void exercise3() {
            int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]%2==0 ? array[i]+" " : "");
            }
            System.out.println();

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 100 && array[i] > 9) {
                    System.out.print(array[i]+" ");
                }
            }
            System.out.println();

            int max = array[0];
            for(int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println(max);

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);

            for (int i = 0; i < array.length/2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+ " ");
            }
        }
}
