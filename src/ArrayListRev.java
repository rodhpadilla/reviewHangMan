import java.util.ArrayList;

public class ArrayListRev {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Bread");
        groceryList.add("Apples");
        System.out.println("My List: " + groceryList);

        // Access 2nd item
        String secondItem = groceryList.get(1);
        System.out.println(secondItem);

        // remove
        groceryList.remove(0);
        System.out.println("My list after removing the first item: " + groceryList);
    }
}
