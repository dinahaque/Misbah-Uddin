
public class Account {

    private int id;
    private String name;
    private int balance;
    private String type;

    // Default constructor
    public Account() {
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for account type
    public void setType(String type) {
        this.type = type;
    }

    // Getter for account type
    public String getType() {
        return type;
    }

    // Withdraw money
    public int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }

    // Deposit money
    public int deposit(int amount) {
        balance = balance + amount;
        return balance;
    }
}