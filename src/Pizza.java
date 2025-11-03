import java.util.ArrayList;

public class Pizza {
    private String size;
    private ArrayList<String> toppings;
    private double price;

    public Pizza(){
        this.size = "Medium";
        this.toppings = new ArrayList<>();
        this.price = 10.00;
    }

    public Pizza(String size) {
        this();
        this.size = size;
        if (size.equals("Large")){
            this.price = 14.00;
        }
    }

    public Pizza(String size, ArrayList<String> toppings){
        this(size);
        this.toppings.addAll(toppings);
        this.price += toppings.size() * 1.50;
    }

    public void displayPizza(){
        System.out.println("----------");
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppings);
        System.out.println("Price: " + price);
    }

}
