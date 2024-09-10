package lab1;

public class Task4 {
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            long result = factorial(i);
            System.out.printf("Факториал числа %d = %d.\n", i, result);
        }
    }
}
