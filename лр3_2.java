
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] newArr = null;
        int N = 0;
        try {
            System.out.println("Введите размерность массива:");
            N = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        if (N>=0) {
        } else {
            System.out.println("Размерность не может быть равна 0 или быть отрицательной.");
            return;
        }
        int[] arr = new int[N];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println("Введите число к удалению:");
        int X = in.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == X) {
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                break;
            }
        }
        System.out.println("Исходный массив:" + Arrays.toString(arr));
        System.out.println("Массив после обработки:" + Arrays.toString(newArr));
    }
}