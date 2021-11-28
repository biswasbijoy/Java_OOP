import java.util.Scanner;
public class Comparison {
        
        public static void main(String[] args) {
                
                int a, b;
                
                Scanner sc = new Scanner(System.in);
                
                a = sc.nextInt();
                b = sc.nextInt();
                
                
                if(a > b) {
                        
                        System.out.printf("%d > %d%n", a, b);
                }
                
                if(a < b) {
                        
                        System.out.printf("%d < %d%n", a, b);
                }
                
                if(a == b) {
                        
                        System.out.printf("%d == %d%n", a, b);
                }
                
                if(a >= b) {
                        
                        System.out.printf("%d >= %d%n", a, b);
                }
                
                if(a <= b) {
                        
                        System.out.printf("%d <= %d%n", a, b);
                }
                sc.close();
        }

}
