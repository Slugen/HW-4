public class Main {
    //Тема "Методы"//

    public static void main(String[] args) {
        //Задача 1
        leapYear(2025);
        //Задача 2
        checkDevice(1, 2019);
        System.out.println(checkDevice(1, 2019));
        //Задача 3
        System.out.println("Потребуется дней: "+(calculateDeliveryDays(95)));
    }
    //Finish "вроде"

    public static void leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }


    }

    public static String checkDevice(int clientOs, int clientDeviceYear) {
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        } else {
            if (clientOs == 0 && clientDeviceYear < 2015) {
                return "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            return deliveryDays;
        } else if (deliveryDistance <= 60) {
            return deliveryDays+=1 ;
        } else if (deliveryDistance<=100) {
            return deliveryDays+=2 ;
        }else{
            return -1 ;
        }


    }




}