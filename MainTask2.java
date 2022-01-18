//MainTask2:  Отобразить в окне консоли аргументы командной строки в обратном порядке.
import java.util.Scanner;

public class ReverseArg {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input word : ");
        String word = in.nextLine();
        System.out.println(reverseString(word));
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
