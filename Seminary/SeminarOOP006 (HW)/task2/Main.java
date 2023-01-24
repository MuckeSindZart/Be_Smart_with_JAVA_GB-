package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> regularLst = new ArrayList<>();
        regularLst.add("Вот");
        regularLst.add("Так");
        regularLst.add("Вот");
        System.out.println("regularLst " + regularLst);

        // test-------------------------------------------//

        ImmutableList<String> immLst = new ImmutableList<>(regularLst);

        System.out.print("ImmutableList [");
        for (Object s : immLst.getList()) {
            System.out.print(s.toString() + " ");
        }
        System.out.println("]" + "Size = " + immLst.getSize());
        System.out.println(immLst.get(1) + " " + immLst.get(1));

        // test-------------------------------------------//

        MutableList<String> mutLst = new MutableList<>(regularLst);

        System.out.print("MutableList [");
        for (Object s : mutLst.getList()) {
            System.out.print(s.toString() + " ");
        }
        System.out.println("]" + "Size =" + mutLst.getSize());

        mutLst.add("Оп");
        mutLst.remove("Так");
        mutLst.set(1, "Оп");
        mutLst.add("Ещё");

        System.out.print("MutableList [");
        for (Object s : mutLst.getList()) {
            System.out.print(s.toString() + " ");
        }
        System.out.println("]" + "Size =" + mutLst.getSize());

    }
}