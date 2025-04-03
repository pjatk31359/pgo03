public class Product {
    int id;
    String name;
    String category;
    double price;
    int stockQuantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void displayInfo(){
        this.id=id;
        this.name=name;
        this.category=category;
        this.price=price;
        this.stockQuantity=stockQuantity;
        System.out.println("ID: " + id + " Name: " + name + " Category: " + category + " Price: " + price + " Stock Quantity: " + stockQuantity);
    }
}
