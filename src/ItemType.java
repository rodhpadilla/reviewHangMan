public enum ItemType {
    CHIPS(1.75, 1),
    SODA(2.50, 2),
    CANDY(1.25, 3);

    private final double price;
    private final int aisle;

    ItemType(double price, int aisle){
        this.price = price;
        this.aisle = aisle;
    }

    public double getPrice() {
        return price;
    }

    public int getAisle() {
        return aisle;
    }
}
