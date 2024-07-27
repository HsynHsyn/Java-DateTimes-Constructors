package Saturday_Reviews.week10;

public class Food {
    public String name;
    public int quantity;
    public double unitPrice;
    public double totalPrice;


    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = unitPrice * quantity;
    }

    public String toString() {
        return name + " " + quantity + " " + unitPrice + " " + totalPrice;
    }

}
