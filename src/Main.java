public class Main {
    public static void main(String[] args) {
        //Циклы//
        //Задача 1
        for (int i=1; i<=10; i+=1) {
            System.out.println(i);
        }
        //Задача 2
        for (int i=10; i>=1; i-=1) {
            System.out.println(i);
        }
        //Задача 3
        for (int i=0; i<=17; i+=2){
            System.out.println(i);
        }
        //Задача 4
        for (int i=10; i>=-10; i-=1){
            System.out.println(i);
        }
        //Задача 5
        for (int i=1904; i<=2096; i+=4){
            System.out.println(i+" год является високосным");
        }
        //Задача 6
        for (int i=7; i<=98; i+=7){
            System.out.println(i);
        }
        //Задача 7
        for (int i=1; i<=512; i*=2){
            System.out.println(i);
        }
        //Задача 8-9
        int salary=29000;
        int total=0;
        for (int i=1; i<=12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 10
        int number=2;
        System.out.println("Таблица умножения на "+number);
        for (int i=0; i<=10; i++){
            System.out.println(number+"x"+i+"="+(number*i));
        }






        }

    }
