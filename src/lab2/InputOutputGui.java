package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;
    private int minNameLength;
    private int maxNameLength;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() throws IllegalArgumentException{

        String fullName = JOptionPane.showInputDialog("Enter full name:");
        if (fullName == null || fullName.isEmpty() || fullName.length() < minNameLength || fullName.length() > maxNameLength) {
            throw new IllegalArgumentException();
        }
        String lastName = "";
        lastName = nameService.extractLastName(fullName);

        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);

    }

}
