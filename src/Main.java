public class Main {
    public static void main(String[] args) {
        //Массивы//
        //Задача 1
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986,};
        int[] daysInWeek = {1, 2, 3, 4, 5, 6, 7,};
        //Задача 2
        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
        for (int i = 0; i < daysInWeek.length; i++) {
            System.out.print(daysInWeek[i] + ",");
        }
        System.out.println();
        //Задача 3
        for (int i=array1.length-1; i>=0; i--){
            System.out.print(array1[i]+", ");
        }
        System.out.println();
        for (int i=array2.length-1; i>=0; i--){
            System.out.print(array2[i]+", ");
        }
        System.out.println();
        for (int i=daysInWeek.length-1;i>=0; i--){
            System.out.print(daysInWeek[i]+", ");
        }
        System.out.println();
        //Задача 4
        int[] numbers={0,1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<numbers.length;i++){
            if (numbers[i]%2==0){
                numbers[i]++;
                System.out.print(numbers[i]+",");
            }
        }


    }
}


