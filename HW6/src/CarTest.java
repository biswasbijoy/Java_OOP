import java.util.EnumSet;

public class CarTest {

    public static void main(String[] args) {
        
        System.out.println("All cars: ");


        for(Car car : Car.values()) {

            System.out.printf("%-10s%-45s%s%n", car, car.getTitle(), car.getPrice());

        }


        System.out.printf("%nDisplay a range of enum constatnts:%n");


        for(Car car : EnumSet.range(Car.MWR, Car.MGA)) {

            System.out.printf("%-10s%-45s%s%n", car, car.getTitle(), car.getPrice());
            
        }

    }
    
}
