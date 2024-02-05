public class Component {

    // Component unique variables
    private String name;
    private String manufacturer;
    private double price;

    // Component constructor
    public Component createComponent(String name, String manufacturer, double price) {
        setName(name);
        setPrice(price);
        setManufacturer(manufacturer);
        toString();
    }

    // Set methods
    private void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            String e = "Error, please give a name at least 3 characters long";
            throw new IllegalArgumentException(e);
        }
    }

    private void setPrice(double price) {
        if (price >= 0 && price <= 10000) {
            this.price = price;
        } else {
            String e = "Error, please give a value from 0 - 10,000";
            throw new IllegalArgumentException(e);
        }
    }
    private void setManufacturer(String manufacturer) {
    }
    private void toString(){

    }

}
