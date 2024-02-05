import java.util.Arrays;
import java.util.List;

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

    // set name method
    private void setName(String name) {
        // handles checking whether the string is valid length
        if (name.length() >= 3) {
            this.name = name;
        } else {
            String e = "Error, please give a name at least 3 characters long";
            throw new IllegalArgumentException(e);
        }
    }
    // set price method
    private void setPrice(double price) {
        // handles checking if price is in correct range
        if (price >= 0 && price <= 10000) {
            this.price = price;
        } else {
            String e = "Error, please give a value from 0 - 10,000";
            throw new IllegalArgumentException(e);
        }
    }
    // set manufacturer method
    private void setManufacturer(String manufacturer) {
        // create a list of the valid available manufacturers
        List<String> validManus = getValidManus();

        // if the list contains the one given, set it
        if (validManus.contains(manufacturer)) {
            this.manufacturer = manufacturer;
        }
        // if not then throw error message
        else {
            throw new IllegalArgumentException(manufacturer + " was not in the list of " +
                    validManus);
        }
    }

    //This method returns a list of all the valid manufacturers
    public static List<String> getValidManus() {
        return Arrays.asList("3Com","Acer","Arctic","AMD", "Asus",
                "Apple Inc.","Bose","Cooler Master", "Hitachi", "Intel",
                "Logitech", "Marvell", "Nvidia", "Qualcomm", "Samsung",
                "Tyan","Fujitsu","MSI","Seagate","Toshiba", "Western Digital", "XTREEM");
    }
    public String toString(){
        return name + "-" + manufacturer + "$" + price;
    }
}
