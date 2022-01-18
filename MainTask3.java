//MainTask3:  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
import java.util.Scanner;
import java.util.Arrays;

public class RandomNumber2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your numbers: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
