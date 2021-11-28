public class PassArray {
        public static void main(String[] args ) {
                
                int[] arr = {1, 2, 3, 4, 5};
                
                System.out.printf("Effects of passing reference to entire array:%n"
                        + "The values of the original array are:%n");
                
                
                for(int value : arr)
                                System.out.printf("     %d", value);
                
                modifyArray(arr);
                System.out.printf("%n%nThe values of the modified array are:%n");
                
                for(int value: arr) 
                        System.out.printf("     %d", value);
                
                System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] after modifyElement: %d%n", arr[3]);
                
                modifyElement(arr[3]);
                System.out.printf("array[3] after modifyElement: %d%n", arr[3]);
                
        }
        
        
        public static void modifyArray(int[] array2) {
                
                for(int counter = 0; counter < array2.length; counter++) {
                        array2[counter] *= 2;
                }
        }
        public static void modifyElement(int element) {
                element *= 2;
                System.out.printf("Value of element in modifyElement: %d%n", element);
        }
}