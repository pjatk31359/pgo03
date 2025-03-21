public class Order {
    int id;
    Customer customer;
    Product[] products;
    int[] quantityies;
    String orderDate;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int[] getQuantityies() {
        return quantityies;
    }

    public void setQuantityies(int[] quantityies) {
        this.quantityies = quantityies;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void calculateTotalValue(int id){
        this.id=id;
        this.products=new Product[this.quantityies.length];
        double totalValue=0;

        for(int i=0;i<quantityies.length;i++){
            if(quantityies[i]>0){
                totalValue=totalValue+quantityies[i];
            }
        }
        System.out.println("Total value:" + totalValue(););
    }

}
