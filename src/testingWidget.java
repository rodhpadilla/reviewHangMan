public class testingWidget {
    public static void main(String[] args) {
        System.out.println("Company Name: " + Widget.factoryName);
        Widget widget1 = new Widget();
        Widget widget2 = new Widget();
        Widget widget3 = new Widget();
        System.out.println("Widget production count: " + Widget.getProductionCounter());
        System.out.println("Widget1 SN: " + widget1.getSerialNumber());
        System.out.println("Widget2 SN: " + widget2.getSerialNumber());
        System.out.println("Widget3 SN: " + widget3.getSerialNumber());
    }
}
