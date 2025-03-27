import java.util.ArrayList;

public class ComputerStore {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void createOrder(Customer customer, Product[] products, int[] quantities) {
        Order order = new Order(orders.size() + 1, customer, products, quantities, new Date(), "New");
        orders.add(order);
        updateStockAfterOrder(order);
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
}