import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        //Тема "Строки"//
        //Задача 1
        String firstName = (" Ivan");
        String middleName = (" Ivanovich");
        String lastName = (" Ivanov");
        String fullName = lastName+firstName+middleName;
        System.out.println("Ф.И.О. сотрудника —" + fullName);

        //Задача 2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета —"+fullName.toUpperCase());

        //Задача 3
        String fullName2 = ("Иванов Семён Семёнович");
        String correctFullName2=fullName2.replace("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника — "+correctFullName2);

        //Finish
    }
}




