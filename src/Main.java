import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Массивы 2//
        //Задача 1
        int[] weeklyExpenses = {7959, 5963, 9530, 6784, 10000};
        int totalExpenses = 0;
        for (int expense : weeklyExpenses) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");

        //Задача 2
        int[] weeklyExpenses2 = {7959, 5963, 9530, 6784, 10000};
        int minExpense = weeklyExpenses2[0];
        int maxExpense = weeklyExpenses2[0];
        for (int expense : weeklyExpenses2) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей");

        //Задача 3
        int[] weeklyExpenses3 = {7959, 5963, 9530, 6784, 10000};
        double averageExpense = 0;
        int allExpenses = 0;
        for (int expense : weeklyExpenses3) {
            allExpenses += expense;
            System.out.println(allExpenses);
        }
        averageExpense = allExpenses / weeklyExpenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        //Finish


    }
}




