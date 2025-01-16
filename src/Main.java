public class Main {
    public static void main(String[] args) {
        //Условный оператор 2//
        //Задача 1-2//
        byte clientOS = 1;
        int clientDeviceYear = 2022;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        //Задача 3//
        int year=2025;
        if (year>=1585){
        if ((year%400 ==0) || (year%4==0 && year%100!=0)){
            System.out.println(year+" год является високосным");
        }else{
            System.out.println(year+" год не является високосным");
        }
        }else{
            System.out.println("Год не может быть меньше 1585");
        }
        //Задача 4//
        byte deliveryDistance = 95;
        byte deliveryDays=1;
        if (deliveryDistance<=20){
            System.out.println("Потребуется дней: "+deliveryDays);
        } else if(deliveryDistance>20 && deliveryDistance<=60){
            System.out.println("Потребуется дней: "+(deliveryDays+1));
        } else if (deliveryDistance>60 && deliveryDistance<=100){
            System.out.println("Потребуется дней: "+(deliveryDays+2));
        }else if (deliveryDistance>100){
            System.out.println("Доставки нет");
        }
        //Задача 5//
        byte monthNumber=5;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Холодная зима");
                break;
            case 3:
            case 4:
            case 5:
                    System.out.println("Расцветающая весна");
                    break;
            case 6:
            case 7:
            case 8:
                System.out.println("Жаркое лето");
                    break;
            case 9:
            case 10:
            case 11:
                System.out.println("Дождливая осень");
                break;
            default:
                System.out.println("Введен неправильный номер месяца");
        }
        //Finish!!!!//



        }

    }
