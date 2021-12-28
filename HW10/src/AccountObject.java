import java.io.Serializable;

public class AccountObject implements Serializable {

    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public AccountObject() {
        this(0, "", "", 0.0); 
    }

    
    public AccountObject(int account, String firstName,
            String lastName, double balance) {
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

   
    public void setAccount(int acct) {
        this.account = acct;
    }


    public int getAccount() {
        return account;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getFirstName() {
        return firstName;
    }

   
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public String getLastName() {
        return lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   
    public double getBalance() {
        return balance;
    }

}