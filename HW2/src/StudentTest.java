import java.util.Scanner;
public class StudentTest {
        
        public static void main(String[] args) {
                
                Scanner sc = new Scanner(System.in);
                
                Student student1 = new Student("201115000", "Jack", 10);
                Student student2 = new Student("201115001", "John", 10);
                Student student3 = new Student("201115002", "Peter", 10);
                Student student4 = new Student("201115003", "William", 10);
                
                
                
                
                String dob1, dob2, dob3, dob4;
                
                
                System.out.printf("Enter the date of birth of the first student: ");
                
                dob1 = sc.nextLine();
                student1.setDob(dob1);
                
                
                System.out.printf("Enter the date of birth of the second student: ");
                
                dob2 = sc.nextLine();
                student2.setDob(dob2);
                
                
                System.out.printf("Enter the date of birth of the third student: ");
                
                dob3 = sc.nextLine();
                student1.setDob(dob3);
                
                
                System.out.printf("Enter the date of birth of the fourth student: ");
                
                dob4 = sc.nextLine();
                student1.setDob(dob4);
                
                
                System.out.println("Full list of students: ");
                
                System.out.printf("Student 1: %n");
                System.out.printf("     Name: %s%n     Id: %s%n     Batch: %s%n     Date of Birth: %s%n%n", student1.getName(), student1.getId(), student1.getBatch(), student1.getDob());
                
                
                
                System.out.printf("Student 2: %n");
                System.out.printf("     Name: %s%n     Id: %s%n     Batch: %s%n     Date of Birth: %s%n%n", student2.getName(), student2.getId(), student2.getBatch(), student2.getDob());
                
                
                System.out.printf("Student 3: %n");
                System.out.printf("     Name: %s%n     Id: %s%n     Batch: %s%n     Date of Birth: %s%n%n", student3.getName(), student3.getId(), student3.getBatch(), student3.getDob());
                
                
                System.out.printf("Student 4: %n");
                System.out.printf("     Name: %s%n     Id: %s%n     Batch: %s%n     Date of Birth: %s%n%n", student4.getName(), student4.getId(), student4.getBatch(), student4.getDob());
                
                
                System.out.printf("Student 1: %n");
                System.out.printf("     Name: %s%n     Id: %s%n     Batch: %s%n     Date of Birth: %s%n%n", student1.getName(), student1.getId(), student1.getBatch(), student1.getDob());
                
                sc.close();
                
        }
        
}