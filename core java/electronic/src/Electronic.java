public class Electronic {


        String brand;
        String model;
        String type;
        double price;
        int warrantyYears;
        boolean isSmartDevice;
        String powerSource;
        String connectivity;
        double weight;
        String countryOfOrigin;

        Electronic(String brand) {
            this.brand = brand;
        }

        Electronic(String brand, String model) {
            this(brand);
            this.model = model;
        }

        Electronic(String brand, String model, String type) {
            this(brand, model);
            this.type = type;
        }

        Electronic(String brand, String model, String type, double price) {
            this(brand, model, type);
            this.price = price;
        }

        Electronic(String brand, String model, String type, double price, int warrantyYears) {
            this(brand, model, type, price);
            this.warrantyYears = warrantyYears;
        }

        Electronic(String brand, String model, String type, double price, int warrantyYears, boolean isSmartDevice) {
            this(brand, model, type, price, warrantyYears);
            this.isSmartDevice = isSmartDevice;
        }

        Electronic(String brand, String model, String type, double price, int warrantyYears, boolean isSmartDevice, String powerSource) {
            this(brand, model, type, price, warrantyYears, isSmartDevice);
            this.powerSource = powerSource;
        }

        Electronic(String brand, String model, String type, double price, int warrantyYears, boolean isSmartDevice, String powerSource, String connectivity) {
            this(brand, model, type, price, warrantyYears, isSmartDevice, powerSource);
            this.connectivity = connectivity;
        }

        Electronic(String brand, String model, String type, double price, int warrantyYears, boolean isSmartDevice, String powerSource, String connectivity, double weight) {
            this(brand, model, type, price, warrantyYears, isSmartDevice, powerSource, connectivity);
            this.weight = weight;
        }

        Electronic(String brand, String model, String type, double price, int warrantyYears, boolean isSmartDevice, String powerSource, String connectivity, double weight, String countryOfOrigin) {
            this(brand, model, type, price, warrantyYears, isSmartDevice, powerSource, connectivity, weight);
            this.countryOfOrigin = countryOfOrigin;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Type: " + type);
            System.out.println("Price: " + price);
            System.out.println("Warranty (Years): " + warrantyYears);
            System.out.println("Smart Device: " + isSmartDevice);
            System.out.println("Power Source: " + powerSource);
            System.out.println("Connectivity: " + connectivity);
            System.out.println("Weight: " + weight);
            System.out.println("Country of Origin: " + countryOfOrigin);
        }
    }

