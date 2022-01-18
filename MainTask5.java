//MainTask5: Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
import java.io.IOException;
import java.util.Scanner;


public class MonthCheck {

        public static void main (String[] args) throws IOException {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число от 1 до 12 : ");
            Integer month = in.nextInt();
            String monthString;
            switch (month) {
                case 1 : monthString = "Январь";
                    break;
                case 2 : monthString = "Февраль";
                    break;
                case 3 : monthString = "Март";
                    break;
                case 4 : monthString = "Апрель";
                    break;
                case 5 : monthString = "Май";
                    break;
                case 6 : monthString = "Июнь";
                    break;
                case 7 : monthString = "Июль";
                    break;
                case 8 : monthString = "Август";
                    break;
                case 9 : monthString = "Сентябрь";
                    break;
                case 10 : monthString = "Октябрь";
                    break;
                case 11 : monthString = "Ноябрь";
                    break;
                case 12 : monthString = "Декабрь";
                    break;
                default: monthString = "Не знаем такого";
                    break;
            }
            System.out.println(monthString);
        }

    }

