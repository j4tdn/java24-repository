package ex02;

public class Vehicle {
    private String name;
    private String type;
    private double price;
    private int engineCapacity;

    public Vehicle(String name, String type, double price, int engineCapacity) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double calculateTax() {
        if (engineCapacity < 100) {
            return price * 0.01;  
        } else if (engineCapacity <= 200) {
            return price * 0.03; 
        } else {
            return price * 0.05;  
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s %-15s %-10d %-15.2f %-15.2f", name, type, engineCapacity, price, calculateTax());
    }

	
	

}
