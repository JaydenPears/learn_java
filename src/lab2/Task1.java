package lab2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя Автора: ");
        String name = in.nextLine();
        System.out.print("Введите адрес электронной почты Автора: ");
        String email = in.next();
        System.out.print("Введите пол Автора одной буквой m, либо f (m - male - мужской; f - female - женский): ");
        String gender = in.next();

        Author newAuthor = new Author(name, email, gender);
        System.out.println(newAuthor.toString());
    }
}
