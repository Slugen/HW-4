public class Main {
    public static void main(String[] args) {
        //Циклы 2//
        //Задача 1
        int salary=15000;
        int total=0;
        int i=0;
        while (total<=2_459_000){
            i++;
            total=total+salary;
        }
        System.out.println("Месяц "+i+" сумма накоплений равна "+total);
        //Задача 2
        int number=1;
        while (number<=10){
            System.out.print(" "+number );
            number++;
        }
        System.out.println();
        for (i=10; i>=1;){
            System.out.printf(" "+i);
            i--;
        }
        //Задача 3
        int population=12_000_000;
        int numberYear =2025;
        while (numberYear <=2035){
            numberYear++;
            population+=17;
            population-=8;
            System.out.println("Год "+ numberYear +", численность населения составляет "+population);
        }
        //Задача 4-5
        int amount=15000;
        double monthlyRate=0.07;
        int month=0;
        while (amount<=12_000_000) {
            amount *= (1 + monthlyRate);
            month++;
            if (month%6==0) {
                System.out.println("Месяц " + month + " сумма накоплений " + amount);
            }
        }
        //Задача 6
        int totalAmount=15000;
        double monthlyPercent=0.07;
        int year=0;
        int halfYear=0;
        int totalMonths=0;
        while (year<=9){
            totalMonths++;
            totalAmount+=(totalAmount*monthlyPercent);
            if (totalMonths%6==0){
                halfYear++;
                System.out.println(totalAmount);
                if (halfYear%2==0) {
                    year++;
                }
            }

        }
        //Задача 7
        int friday=3;
        while (friday<=31){
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет");
            friday+=7;
        }
        //Задача 8
        for (int i1=1896; i1<=2054;) {
            System.out.println(i1);
            i1+=79;
        }
















        }

    }
