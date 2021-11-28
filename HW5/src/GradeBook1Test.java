public class GradeBook1Test {
        
        public static void  main(String[] args) {
                
                int[][] gradesArray = {{87, 96, 70}, 
                                       {68, 87, 90},
                                       {94, 100, 90},
                                       {100, 81, 82},
                                       {83, 65, 85},
                                       {78, 87, 65},
                                       {85, 75, 86}, 
                                       {91, 94, 100},
                                       {76, 72, 84},
                                       {87, 93, 73}};
                
                
                GradeBook1 myGradeBook = new GradeBook1("Object Oriented Programming", gradesArray);
                
                
                System.out.printf("Welcome to Grade Book for %n%s%n%n", myGradeBook.getCourseName());
                
                myGradeBook.processGrade();
                
        }
        
}