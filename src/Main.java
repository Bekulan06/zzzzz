import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String oneTwo;
        final int Num = 5;
        String word = " word";
        System.out.println(Num + word);
        if (Num < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (Num > 0) {
            System.out.println("Вы сохранили положительное число");



        } else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String i=scanner.nextLine();
        System.out.println("Здраствуйте " + i);
    }
}