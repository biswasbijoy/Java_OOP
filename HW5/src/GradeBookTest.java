public class GradeBookTest {
        
        public static void  main(String[] args) {
                
                int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
                
                
                GradeBook myGradeBook = new GradeBook("Object Oriented Programming", gradesArray);
                
                
                System.out.printf("Welcome to Grade Book for %n%s%n%n", myGradeBook.getCourseName());
                
                myGradeBook.processGrade();
                
        }
        
}