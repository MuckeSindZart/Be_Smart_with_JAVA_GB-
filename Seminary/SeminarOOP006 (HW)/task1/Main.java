package task1;

import java.util.Scanner;

public class Main {

    public static void testMenu() {

        int usrInput;
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Для разблакировки выбирете нужный пункт: \n" +
                "1- FaceUnloсker \n" +
                "2- FingerPrintUnloсker \n" +
                "3- PinCodeUnloсker \n" +
                "4- WithoutPasswordUnloсker \n" +
                "5- Выход \n");

        System.out.print("Input ~> ");

        usrInput = sc.nextInt();
        
        switch (usrInput) {
            case 1:
                new SmartPhone(new FaceUnloсker()).getPhoneUnlocker().unlock();
                testMenu();

                break;

            case 2:
                new SmartPhone(new FingerPrintUnloсker()).getPhoneUnlocker().unlock();
                testMenu();

                break;

            case 3:
                new SmartPhone(new PinCodeUnloсker()).getPhoneUnlocker().unlock();
                testMenu();
                break;

            case 4:
                new SmartPhone(new WithoutPasswordUnloсker()).getPhoneUnlocker().unlock();
                testMenu();
                break;

            case 5:
                sc.close();
                return;

            default:
                testMenu();
        }

        sc.close();

    }

    public static void main(String[] args) {

        testMenu();

    }
}
