package opgave01;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));

        System.out.println("Alle tal i HashSettet");
        for (int num : mySet) {
            System.out.println(num);
        }

        //b indsæt nummeret 23
        mySet.add(23);
        System.out.println("");

        System.out.println("Alle tal i HashSettet efter at 23 er added");
        for (int num : mySet) {
            System.out.println(num);
        }
        System.out.println("");

        System.out.println("ALle tal efter 67 er fjernet");
        mySet.remove(67);
        for (int num : mySet) {
            System.out.println(num);
        }
        System.out.println("");

        if (mySet.contains(23)) {
            System.out.println("Sættet indeholder 23");
        } else {
            System.out.println("Sættet indeholder ikke 23");
        }
        System.out.println("");
        System.out.println("mySet indeholder " + mySet.size() + " sæt/tal");
    }
}
