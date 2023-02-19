import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1 () {

        System.out.println("Задача 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 0 если у вас IOS либо число 1 если у вас Android");
        int clientOS = sc.nextInt();

        if (clientOS == 0 && clientOS != 1) {
            System.out.println("«Установите версию приложения для iOS по ссылке». ");
        } else {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }
    }
}