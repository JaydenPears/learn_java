package lab2;
import java.util.Scanner;

// reverse array of Strings
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[10];
        System.out.println("Введите 10 слов:");
        for (int i = 0; i < arr.length; i++) {
            String newString = in.next();
            arr[i] = newString;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
    }
}
