import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String oneTwo;
        final int Num = 5;
        String word = " word";
        System.out.println(Num + word);
        if (Num < 0){
            System.out.println("�� ��������� ������������� �����");
        } else if (Num > 0) {
            System.out.println("�� ��������� ������������� �����");



        } else {
            System.out.println("�� ��������� ����");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ���");
        String i=scanner.nextLine();
        System.out.println("����������� " + i);
    }
}