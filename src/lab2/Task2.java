package lab2;

// HowMany.java
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            count++;
        }
        System.out.println("Вы ввели в консоль " + count + " слов.");
    }
}
