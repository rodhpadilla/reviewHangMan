import java.util.UUID;

public class Widget {
    public static final String factoryName = "WidgetWorks";
    private static int productionCounter = 0;
    private final String serialNumber;

    public Widget(){
        UUID uuid = UUID.randomUUID();
        this.serialNumber = uuid.toString();
        productionCounter++;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public static int getProductionCounter() {
        return productionCounter;
    }
}
