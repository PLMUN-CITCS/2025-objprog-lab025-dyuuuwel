// Item class demonstrating static members
class Item {
    // Static variable to track number of objects created
    static int objectCount = 0;

    // Instance variable
    String itemName;

    // Constructor to initialize item name and increment object count
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    // Instance method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

// Main class containing the main method
public class ItemDemo {
    public static void main(String[] args) {
        // Creating objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Displaying item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Displaying total object count using static method
        Item.displayObjectCount();
    }
}
