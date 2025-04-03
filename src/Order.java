import java.util.Date;

public class Order {
    int id;
    Customer customer;
    Product[] products;
    int[] quantities;
    private Date date;
    String status;

    public Order(int id, Customer customer, Product[] products, int[] quantities, Date date, String status) {
        this.id = id;
       this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.date = date;
        this.status = status;
    }

    public double calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * quantities[i];
        }
        return total;
    }

    public void applyDiscount() {
        if (customer.isLoyalCustomer()) {
            System.out.println("Applying 10% discount...");
            System.out.println("Total Price after Discount: " + (calculateTotalValue() * 0.9));
        }
    }
    public void displayDetails() {
        System.out.println("Order ID: " + id + ", Date: " + date + ", Status: " + status);
        System.out.println("Customer: " + customer.getId());
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + " x " + quantities[i]);
        }
        System.out.println("Total Price: " + calculateTotalValue());
    }
}