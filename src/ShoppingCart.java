import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Component> items;

    public ShoppingCart(ArrayList<Component> items) {
        this.items = items;
    }

    public void addItem(Component item) {
        items.add(item);
    }

    public void getTotalPrice(Component item) {
        items.remove(item);
    }
}
