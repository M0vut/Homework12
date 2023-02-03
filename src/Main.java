import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Main {
    // Первое задание
    public static int leapYearQualifier(int year) {

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " год - високосный год");
        } else
            System.out.println(year + " год - не високосный");
        return year;
    }
    // Второе задание
    public static void clientDevice(int clientDeviceYear, int clientOs) {

        int currentYear = LocalDate.now().getYear();

        if (clientOs == 1) {
            System.out.println("Установите приложения для Android по ссылке»");
        } else if (clientOs == 0) {
            System.out.println("Установите приложения для iOS по ссылке»");
        }
        if (clientDeviceYear < currentYear && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < currentYear && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        }

        if (clientDeviceYear == currentYear && clientOs == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (clientDeviceYear == currentYear && clientOs == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");

        }

    }
    // Третье задание
    public static int deliveryDistance(int deliveryDistance) {

        int timeOfDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется одни сутки ");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется двое суток");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется трое суток");
        }else if(deliveryDistance >100)
        {
            System.out.println("Доставки нет");
        }
        return deliveryDistance;
    }


    public static void main (String[]args) {
        System.out.println("Домашнее задание 1");
        int year = 210;
        leapYearQualifier(year);

        System.out.println("Домашнее задание 2");

        int clientDeviceYear = 202;
        int os = 0;
        clientDevice(clientDeviceYear, os);

        System.out.println("Домашнее задание 3");

        int deliveryDistance = 100;
        deliveryDistance(deliveryDistance);

    }
}

