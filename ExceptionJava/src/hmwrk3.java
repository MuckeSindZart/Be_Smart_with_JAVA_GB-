public class hmwrk3 {
    public static void main(String[] args) {
/*1.    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива
        другого размера необходимо бросить исключение MyArraySizeException. */

/*2.    Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
        текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой
        именно ячейке лежат неверные данные. */

/*3.    В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
        MyArrayDataException и вывести результат расчета (сумму элементов, при условии что
        подали на вход корректный массив).*/

        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };


        try {
            int sum = arraySum(arr);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Массив неправильного размера (!4х4)");
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Неправильные данные под индексом (" + e.getRow() + ", " + e.getCol() + ")");
            e.printStackTrace();
        }

    }

    public static void checkArraySize(String[][] array, int reqSize)  throws MyArraySizeException{
        if (array.length != 4) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < reqSize; i++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException();
                }
            }
        }
    }

    public static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(array, 4);

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}

class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super();
    }
}

class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    MyArrayDataException(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


}


