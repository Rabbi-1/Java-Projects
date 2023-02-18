package application;
import javax.swing.JOptionPane;
public class nameDialog {
    public static void main (String [] args){
        String firstName;
        String middleName;
        String lastName;

        firstName = JOptionPane.showInputDialog("What is your first name?" );
        middleName = JOptionPane.showInputDialog("What is your middle name? ");
        lastName = JOptionPane.showInputDialog("What is your last name? ");
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + middleName +
                " " + lastName);
        System.exit(0);
    }
}
