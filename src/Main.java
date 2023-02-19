import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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

    public static void task4 () {

        System.out.println("Задача 4");

        int deliveryDistance = 95;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3.");
        } else if (deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет.");
        }

    }

    public static void task5 () {

        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("null");
        }
    }
}