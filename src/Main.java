
public class Main {
    public static void main(String[] args) {
        Component component1 = Component.createComponent("motherboard","Asus",429.99);
        System.out.println("component1 Expected output: motherboard-Asus, price: $429.99");
        System.out.println("component1 Actual output:   "+component1+"\n");

        Component component2 = Component.createComponent("processor","Intel",519.99);
        System.out.println("component2 Expected output: processor-Intel, price: $519.99");
        System.out.println("component2 Actual output:   "+component2+"\n");

        Component component3 = Component.createComponent("case","Cooler Master",289.99);
        System.out.println("component3 Expected output: case-Cooler Master, price: $289.99");
        System.out.println("component3 Actual output:   "+component3+"\n");

        Component component4 = Component.createComponent("fan","Arctic",52.99);
        System.out.println("component4 Expected output: fan-Arctic, price: $52.99");
        System.out.println("component4 Actual output:   "+component4+"\n");

        Component component5 = Component.createComponent("video card","Nvidia",2100.99);
        Component component6 = Component.createComponent("keyboard","Logitech",86.99);
        Component component7 = Component.createComponent("mouse","Logitech",36.99);
        Component component8 = Component.createComponent("speakers","Bose",36.99);
        Component component9 = Component.createComponent("NIC","3Com",76.99);
        Component component10 = Component.createComponent("RAM","XTREEM",210.42);
        Component component11 = Component.createComponent("sound card","Asus",323.00);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(component1);
        shoppingCart.addItem(component2);
        shoppingCart.addItem(component3);
        shoppingCart.addItem(component4);
        shoppingCart.addItem(component5);
        shoppingCart.addItem(component6);
        shoppingCart.addItem(component7);
        shoppingCart.addItem(component8);
        shoppingCart.addItem(component9);
        shoppingCart.addItem(component10);
        shoppingCart.addItem(component11);

        System.out.println("\nThe shopping cart: "+shoppingCart);
        System.out.println("The items in the cart are: "+shoppingCart.getComponentNames());

        //Bonus
        System.out.printf("%n%s%n",shoppingCart.getTableSummary());
        ShoppingCart emptyCart = new ShoppingCart();
        System.out.println("\n\nEmpty Shopping Cart Table");
        System.out.printf("%n%s%n",emptyCart.getTableSummary());
    }
}
