import javax.swing.JOptionPane;

public class Addition {
    
    public static void main(String[] args) {
        
        String firstNumber = JOptionPane.showInputDialog("Enter first number");
        String secondNumber = JOptionPane.showInputDialog("Enter Second number");

        int num = Integer.parseInt(firstNumber);
        int num1 = Integer.parseInt(secondNumber);

        int sum = num + num1;

        JOptionPane.showMessageDialog(null, "The sum is " + sum,
                        "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }

}
