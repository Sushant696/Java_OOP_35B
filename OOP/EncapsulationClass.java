package OOP;

class encapsulation {

    public static void main(String[] args) {
        // Creating three laptop objects
        Laptop laptop1 = new Laptop("Apple", "Apple Air M3");
        laptop1.setPrice(150000);
        laptop1.setRam(10);
        laptop1.setStorage(256);
        laptop1.year = 2022;

        Laptop laptop2 = new Laptop("Dell", "XPS 15");
        laptop2.setPrice(120000);
        laptop2.setRam(16);
        laptop2.setStorage(512);
        laptop2.year = 2023;

        Laptop laptop3 = new Laptop("HP", "Spectre x360");
        laptop3.setPrice(140000);
        laptop3.setRam(8);
        laptop3.setStorage(256);
        laptop3.year = 2024;

        // Calling upgrade and inflation methods
        laptop1.upgrade(4, 256);
        laptop1.inflation(5000);

        laptop2.upgrade(8, 512);
        laptop2.inflation(10000);

        laptop3.upgrade(16, 512);
        laptop3.inflation(15000);

        // Printing the details
        laptop1.printDetails();
        laptop2.printDetails();
        laptop3.printDetails();
    }
}

/// encapsulation encloses/bundles similar properties, attributes, and
/// functions/methods in a single class

class Laptop {
    String brand;
    String name;

    // Constructor
    public Laptop(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    // Private attributes
    private double price;
    private int ram;
    private int storage;
    public int year;

    // Setter and getter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    // Setter and getter for ram
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return this.ram;
    }

    // Setter and getter for storage
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return this.storage;
    }

    // Upgrade method
    public void upgrade(int additionalRam, int additionalStorage) {
        this.ram += additionalRam;
        this.storage += additionalStorage;
    }

    // Inflation method
    public void inflation(double additionalPrice) {
        this.price += additionalPrice;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Ram: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Year: " + year);
        System.out.println();
    }
}

// task
// make an constructer of laptop that takes brand and name
// makea setter and getter for remaining private attributes ram storage
// make a function upgrade() takes, 3 number for ram and storage
// and add them to current value of ram and storage
// make a function inflation() takes 1 number price
// and add to the current value of price
// make 3 object fill the attribute and call upgrade and inflation

// print the following
// Brand : apple
// Name : apple aiir m3
// Price : 150000
// Ram : ram 10gb
// storage : 256 gb
// year 2022