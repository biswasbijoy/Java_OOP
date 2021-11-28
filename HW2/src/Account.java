public class Account {
        
    private double balance;
    private String name;
    
    
    public Account(String name, double balance) {
            this.name =name;
            
            if(balance > 0.0) {
                    this.balance = balance;
            }
    }
    
    
    public void setName(String  name) {
            this.name = name;
    }
    
    
    public void diposit(double dipositAmount) {
            if(dipositAmount > 0.0) {
                    balance += dipositAmount;
            }
    }
    
    public String getName() {
            return name;
    }
    
    
    public double getBalance() {
            return balance;
    }
    
}
