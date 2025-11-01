import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExe {
    public static void main(String[] arg) {

        // Old approach
        ArrayList<String> recipe1 = new ArrayList<>(List.of("Flour", "Sugar", "Eggs", "Milk"));
        ArrayList<String> recipe2 = new ArrayList<>(List.of("Sugar", "Butter", "Flour", "Vanilla"));
        ArrayList<String> recipe3 = new ArrayList<>(List.of("Milk", "Eggs", "Butter", "Salt"));
        Set<String> uniqueIngredients = new HashSet<>();
        for (String s : recipe1) {
            uniqueIngredients.add(s);
        }
        for (String s : recipe2) {
            uniqueIngredients.add(s);
        }
        for (String s : recipe3) {
            uniqueIngredients.add(s);
        }

        if (uniqueIngredients.contains("Sugar")) {
            System.out.println("It contains sugar!");
        }
        System.out.println(uniqueIngredients);

        // More modern approach
//        ArrayList<String> recipe1 = new ArrayList<>(List.of("Flour", "Sugar", "Eggs", "Milk"));
//        ArrayList<String> recipe2 = new ArrayList<>(List.of("Sugar", "Butter", "Flour", "Vanilla"));
//        ArrayList<String> recipe3 = new ArrayList<>(List.of("Milk", "Eggs", "Butter", "Salt"));
//
//        Set<String> uniqueIngredients = new HashSet<>(recipe1);
//        uniqueIngredients.addAll(recipe2);
//        uniqueIngredients.addAll(recipe3);
//
//        if (uniqueIngredients.contains("Sugar")) {
//            System.out.println("It contains sugar!");
//        }
//
//        System.out.println(uniqueIngredients);
    }
}
