public class Customer {
    int id;
    String firstName;
    String lastName;
    String email;
    boolean isLoyalCustomer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void setLoyalCustomer(boolean loyalCustomer) {
        isLoyalCustomer = loyalCustomer;
    }

    public void displayInfo(int id, String firstName, String lastName, String email, boolean isLoyalCustomer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isLoyalCustomer = isLoyalCustomer;
        System.out.println("ID: " + id + " First Name: " + firstName + " Last Name: " + lastName + " Email: " + email + " Is Loyal Customer: " + isLoyalCustomer);
    }
}
