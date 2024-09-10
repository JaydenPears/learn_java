package lab1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        System.out.println("Введите последовательно 10 чисел в массив: ");
        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();
            arr[i] = num;
            sum += arr[i];
        }
        double avg_num = sum / 10.0;
        System.out.println("Среднее значение массива: " + avg_num);
        in.close();
    }
}
