import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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

    public static void task2 () {

        System.out.println("Задача 2");

        Scanner os = new Scanner(System.in);
        System.out.println("Введите число 0 если у вас IOS либо число 1 если у вас Android.");
        int clientOS = os.nextInt();
        Scanner deviceYear = new Scanner(System.in);
        System.out.println("Введите год выпуска вашего устройства.");
        int clientDeviceYear = deviceYear.nextInt();

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (clientDeviceYear < 2015 && clientOS == 1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке».");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке». ");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }
    }

    public static void task3 () {

        System.out.println("Задача 3");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год.");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("«" + year + " год является високосным».");
        } else {
            System.out.println("«" + year + " год не является високосным».");
        }

    }
}