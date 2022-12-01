package com.seminar002;

import java.io.FileWriter;
import java.io.IOException;

// -------------------- Task1 -------------------- //
// public class App {
// public static void main(String[] args) {
// String CharLoop = getCharLoop(10 , 'A', '-');
// System.out.println(CharLoop);
// }

// public static String getCharLoop(int Len, char A1, char A2) {

// StringBuilder newStringBuilder = new StringBuilder();
// for (int i = 0; i < Len; i++)
// if (i % 2 == 0)
// newStringBuilder.append(A1);
// else
// newStringBuilder.append(A2);
// return newStringBuilder.toString();
// }

// -------------------- Task2 -------------------- //

// public class App {
// public static void main(String[] args) {

// String str1 = "aaaaabbbcddffg";
// Compress(str1);

// }

// public static void Compress(String str1) {
// String str2 = "";
// int charCount = 1;
// for (int i = 1; i < str1.length(); i++) {
// if (str1.charAt(i) == str1.charAt(i - 1)) {
// charCount++;
// }

// else {
// str2 += str1.charAt(i - 1);
// str2 += charCount;
// charCount = 1;
// }
// }
// str2 += str1.charAt(str1.length() - 1);
// str2 += charCount;
// System.out.println(str2);
// }
// }

// -------------------- Task3 -------------------- //

// public class App {
//     public static void main(String[] args) {
//         String str1 = "vaavk";
//         System.out.println( checkPoly(str1));
//     }

//     public static boolean checkPoly(String str1) {

//         for (int i = 0; i< str1.length()/2; i++){
//             if (str1.charAt(i)!=str1.charAt(str1.length()-1-i)){
//                 return false;
//             }

//         }
//         return true;
//     }
// }

// -------------------- Task4 -------------------- //

public class App {
    public static void main(String[] args) {
        String str = "";
        str = multiplyWord("test_", 100);
        System.out.println(str);
        fileSave(str);
    }

    public static String multiplyWord(String word, int N) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            builder.append(word);
        }
        return builder.toString();
    }

    private static void fileSave(String str) {

        try (FileWriter writer = new FileWriter("Test.txt", false))
        {
            writer.write(str);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
