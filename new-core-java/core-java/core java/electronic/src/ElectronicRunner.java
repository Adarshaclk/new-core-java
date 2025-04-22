
public class ElectronicRunner {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model = "Galaxy Tab S9";
        String type = "Tablet";
        double price = 799.99;
        int warrantyYears = 2;
        boolean isSmartDevice = true;
        String powerSource = "Battery";
        String connectivity = "Wi-Fi & Bluetooth";
        double weight = 0.5;
        String countryOfOrigin = "South Korea";

        Electronic electronics = new Electronic(brand, model, type, price, warrantyYears, isSmartDevice, powerSource, connectivity, weight, countryOfOrigin);
        electronics.displayInfo();
    }
}

