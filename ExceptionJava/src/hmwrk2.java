import java.io.*;
import java.util.Scanner;

public class hmwrk2 {

    public static void main(String[] args) throws Exception {

        /*1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
        //====================================================================//
//        System.out.println("task_1");
//        for (int i = 0; i < 5; i++) {
//            task_1();
//        }

        /*2) Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)*/
        //====================================================================//
        System.out.println("task_2");
        task_2();


        /*3) Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)*/
        //====================================================================//
        System.out.println("task_3");
        task_3();

    //4) Исправьте код, примените подходящие способы обработки исключений:....
        //====================================================================//

        System.out.println("task_4");
        task_4();
    }


    private static void task_1() {
        System.out.print("Введите дробное число -> ");
        Scanner scan = new Scanner(System.in);

        try {
            Float num = Float.parseFloat(scan.nextLine());
            System.out.printf("Введено число - %f\n", num);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.print("Это не дробное число!\n");

        }
    }

    private static void task_2() {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            e.printStackTrace();
        }
    }

    private static void task_3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
            ex.printStackTrace();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
            ex.printStackTrace();
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
            ex.printStackTrace();
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static void task_4() {
        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (StackOverflowError error) {
            System.out.println("Что-то сломалось");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}



