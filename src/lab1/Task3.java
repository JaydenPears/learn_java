package lab1;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double num = 1.0 / (i * i);
            if (i != 1) {
                System.out.printf(" ");
            }
            System.out.printf("%f", num);
            if (i != 10) {
                System.out.printf(" +");
            }
        }
        System.out.println();
    }
}
