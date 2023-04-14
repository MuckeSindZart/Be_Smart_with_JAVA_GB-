import java.util.Arrays;
import java.util.Random;

public class hmwrk1 {
    public static void main(String[] args) {

        Integer[] firstArray = fillArray(5);
        printArray(firstArray);

        Integer[] secondArray = fillArray(5);
        printArray(secondArray);

        System.out.println("Разница массивов:");
        printArray(diffArrays(firstArray, secondArray));
        System.out.println("Сумма массивов:");
        printArray(summArrays(firstArray, secondArray));


        System.out.println("Пробуем исключения:");
        secondArray = new Integer[]{null, 2, 2, null, null};
        printArray(secondArray);
        printArray(diffArrays(firstArray, secondArray));

    }

    public static Integer[] summArrays(Integer[] firstArr, Integer[] secondArr) {

        probeArrayHasSameLength(firstArr, secondArr);
        probeNullInArray(firstArr, "firstArray");
        probeNullInArray(secondArr, "secondArray");

        Integer[] array = new Integer[firstArr.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = firstArr[i] + secondArr[i];
        }
        return array;
    }

    public static Integer[] diffArrays(Integer[] firstArr, Integer[] secondArr) {

        probeArrayHasSameLength(firstArr, secondArr);
        probeNullInArray(firstArr, "firstArray");
        probeNullInArray(secondArr, "secondArray");


        Integer[] array = new Integer[firstArr.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = firstArr[i] - secondArr[i];
        }
        return array;
    }

    public static void probeArrayHasSameLength(Integer[] firstArr, Integer[] secondArr) {
        if (firstArr.length != secondArr.length) {
            throw new RuntimeException("Массивы разной длины.");
        }
    }

    public static void probeNullInArray(Integer[] arr, String Name) {
        String msg = String.format("Массив %s содержит null по индексом ->", Name);
        boolean probe = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == null) {
                msg = String.format("%s : %d", msg, i);
                probe = true;
            }
        }
        if (probe) {
            throw new NullPointerException(msg);
        }
    }

    public static Integer[] fillArray(Integer len) {

        Integer[] array = new Integer[len];
        Random rand = new Random();

        for (int i = 0; i < len; i++) {
            array[i] = rand.nextInt(1, 10);
        }
        return array;
    }

    public static void printArray(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
