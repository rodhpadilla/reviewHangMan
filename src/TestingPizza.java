import java.util.ArrayList;
import java.util.Arrays;

public class TestingPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.displayPizza();

        Pizza pizza1 = new Pizza("Large");
        pizza1.displayPizza();

        ArrayList<String> toppings = new ArrayList<>(Arrays.asList("peperoni", "pineapple", "cheese"));
        Pizza pizza2 = new Pizza("Large", toppings);
        pizza2.displayPizza();
    }
}
