public class Electronics {

    String productName;
    String modelNumber;
    String brand;
    double price;
    boolean isWireless;
    int warrantyPeriod;
    String batteryType;
    String connectivityTechnology;
    String energyEfficiencyRating;
    String manufacturingDate;

    public Electronics() {
        System.out.println("Default Constructor");
    }

    public Electronics(String productName, String modelNumber, String brand, double price, boolean isWireless) {
        this();
        this.productName = productName;
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.price = price;
        this.isWireless = isWireless;
        System.out.println("Constructor 2: Calls Constructor 1");
    }


    public Electronics(String productName, String modelNumber, String brand, double price, boolean isWireless, int warrantyPeriod, String batteryType) {
        this(productName, modelNumber, brand, price, isWireless);
        this.warrantyPeriod = warrantyPeriod;
        this.batteryType = batteryType;
        System.out.println("Constructor 3: Calls Constructor 2");
    }


    public Electronics(String productName, String modelNumber, String brand, double price, boolean isWireless, int warrantyPeriod, String batteryType, String connectivityTechnology, String energyEfficiencyRating) {
        this(productName, modelNumber, brand, price, isWireless, warrantyPeriod, batteryType);
        this.connectivityTechnology = connectivityTechnology;
        this.energyEfficiencyRating = energyEfficiencyRating;
        System.out.println("Constructor 4: Calls Constructor 3");
    }

    public Electronics(String productName, String modelNumber, String brand, double price, boolean isWireless, int warrantyPeriod, String batteryType, String connectivityTechnology, String energyEfficiencyRating, String manufacturingDate) {
        this(productName, modelNumber, brand, price, isWireless, warrantyPeriod, batteryType, connectivityTechnology, energyEfficiencyRating);
        this.manufacturingDate = manufacturingDate;
        System.out.println("Constructor 5: Calls Constructor 4");
    }

    public static void main(String[] args) {
        Electronics electronics = new Electronics("Smartphone", "S1234",
                "TechBrand", 799.99, true, 2, "Lithium-Ion",
                "Bluetooth 5.0", "A++", "2024-12-15");
    }
}

