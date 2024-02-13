package ATM;

public class Account {
    // define an account class to include account information
    // include: card number, client name, gender, password, remaining balance, withdrawal limit
    private String id;
    private String name;

    private char gender; // F/M
    private String password;
    private double balance;
    private double limit;

/*    public Account() {
    }

    public Account(String id, String name, char gender, String password, double balance, double limit) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.balance = balance;
        this.limit = limit;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

}
