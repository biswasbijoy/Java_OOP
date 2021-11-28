import java.util.Scanner;
public class AdditionTest {
        
        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);

                int a = sc.nextInt();
                int b = sc.nextInt();

                Addition addition = new Addition();

                System.out.printf("Sum = %d", addition.add(a, b));
                sc.close();
        }

}
