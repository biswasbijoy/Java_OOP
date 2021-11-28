import java.util.Scanner;
public class AccountTest {
        
        public static void main(String[] args) {
                
                Account account1 = new Account("John", 100);
                Account account2 = new Account("Jack", 90);
                
                
                Scanner sc = new Scanner(System.in);
                
                
                double dipo1, dipo2;
                
                System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
                System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
                
                System.out.printf("Enter diposit amount for account1: ");
                dipo1 = sc.nextDouble();
                account1.diposit(dipo1);
                
                System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
                System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
                
                
                System.out.printf("Enter diposit amount for account2: ");
                dipo2 = sc.nextDouble();
                account2.diposit(dipo2);
                
                
                System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
                System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
                

                sc.close();
                
        }
        
}