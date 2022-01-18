//MainTask1: Приветствовать любого пользователя при вводе его имени через командную строку.
import java.util.Scanner;

public class HelloName {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.printf("Hello, %s! \n", name);
        in.close();
        System.out.println(reverseString(name));
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
