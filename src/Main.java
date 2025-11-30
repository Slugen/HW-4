import java.time.LocalDate;

public class Main {
    //Тема "Методы"//

    public static void main(String[] args) {
        //Задача 1
        leapYear(2025);
        //Задача 2
        checkDevice(1, 2019);
        //Задача 3
        System.out.println("Потребуется дней: " + (calculateDeliveryDays(95)));
    }
    //Finish "вроде"

    public static void leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }


    }

    public static void checkDevice(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите приложения для iOS по ссылке");
        }
    }   



    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            return deliveryDays;
        } else if (deliveryDistance <= 60) {
            return deliveryDays += 1;
        } else if (deliveryDistance <= 100) {
            return deliveryDays += 2;
        } else {
            return -1;
        }


    }
}