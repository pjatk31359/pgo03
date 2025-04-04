import java.util.ArrayList;
import java.util.Date;

public class ComputerStore {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    int productCount;
    int customerCount;
    int orderCount;

    public ComputerStore() {
//        products = new Product[10];
//        customers = new Customer[10];
//        orders = new Order[10];
        productCount = 0;
        customerCount = 0;
        orderCount = 0;

    }

    public void addProduct(Product product) {
        products.set(productCount, product);
        productCount++;
    }

    public void addCustomer(Customer customer) {
        customers.set(customerCount, customer);
        customerCount++;
    }

    public Order createOrder(Customer customer, Product[] products, int[] quantities) {
        Order order = new Order(orders.size() + 1, customer, products, quantities, new Date(), "New");
        orders.add(order);
        updateStockAfterOrder(order);
        return order;
    }

    public void updateStockAfterOrder(Order order) {
        for (int i = 0; i < order.products.length; i++) {
            Product product = order.products[i];
            product.setStockQuantity(product.getStockQuantity() - order.quantities[i]);
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        for (Order order : orders) {
            if (order.id == orderId) {
                order.status = newStatus;
                break;

            }
        }
    }

    public void displayProductsInCategory(String category) {
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                product.displayInfo();
            }
        }
    }

    public void displayCustomerOrders(int customerId) {
        for (Order order : orders) {
            if (order.customer.getId() == customerId) {
                order.displayDetails();
            }
        }
    }

    public void updateStockAfter0rder(Order order1) {
        for (int i = 0; i < order1.products.length; i++) {
            Product product = order1.products[i];
            product.setStockQuantity(product.getStockQuantity() - order1.quantities[i]);
        }
    }
}

