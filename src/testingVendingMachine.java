public class testingVendingMachine {
    public static void main(String[] args) {
        VendingItem chips = new VendingItem(ItemType.CHIPS, 5);
        VendingItem candies = new VendingItem(ItemType.CANDY, 5);
        VendingItem sodas = new VendingItem(ItemType.SODA, 5);

        System.out.println("Soda Price:" + sodas.getType().getPrice());

        for (int dispenseTimes = 1; dispenseTimes < 7; dispenseTimes++ ) {
            String result = (chips.dispense()) ? " --> SUCCESS" : " --> FAILED";
            System.out.println("Dispensing attempt " + dispenseTimes + result);
        }

        System.out.println("Total CHIPS: " + chips.getQuantity());

        for (int restockTimes = 1; restockTimes < 11; restockTimes++){
            System.out.println("Restocking attempt " + restockTimes);
            chips.restock(1);
        }

        System.out.println("Total CHIPS: " + chips.getQuantity());

    }
}
