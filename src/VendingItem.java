public class VendingItem {
    private ItemType type;
    private int quantity;

    public VendingItem(ItemType type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public ItemType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void restock(int amount){
        quantity += amount;
    }

    public boolean dispense(){
        if (quantity > 0) {
            quantity -= 1;
            return true;
        }
        return false;
    }

}
