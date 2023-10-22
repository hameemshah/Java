package Oops;
public class Const {
    public static void main(String[] args) {
        Customer c1 = new Customer("Bob", 100, "tim@gmail.com");
        System.out.println(c1.getEmail());
    }
}

class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, int creditLimit, String email) {
        this.creditLimit = creditLimit;
        this.email = email;
        this.name = name;
    }

    public Customer() {
        this("someone", 0, "someone@example.com");
    }

    public Customer(String name, String email) {
        this(name, 0, email);
    }
}
