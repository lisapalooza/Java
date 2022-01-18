//MainTask4 :  Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        System.out.print("Введите второе число: ");
        int m = in.nextInt();
        int sum = n + m;
        System.out.println("Сумма чисел = " +sum );
    }
}
