package lab3;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {

    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    private int minNameLength = 1;
    private int maxNameLength = 20;

    /**
     * Finds and returns the last name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractFirstName(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length > 2) {
            throw new IllegalArgumentException("Please only enter yor first and last name");
        }
        String fname = nameParts[FIRST_NAME_IDX].trim();
        if (fname.isEmpty() || fname.length() < 1) {
            throw new IllegalArgumentException("Last name must be atleast 1 character");
        }
        if (!fname.matches("[a-zA-Z]*")) {
            throw new IllegalArgumentException("Name must only contain letters");
        }
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Finds and returns the first name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {

        if (fullName.length() < minNameLength) {
            throw new NameTooShortException();
        }
        if (fullName.length() > maxNameLength){
            throw new NameTooLongException();
        }
        if (fullName.matches("[a-zA-Z]*")) {
            throw new IllegalCharacterException();
        }

        String[] nameParts = fullName.split(" ");
        if (nameParts.length != 2) {
            throw new IllegalArgumentException("Please enter yor first and last name only");
        }

        String lname = nameParts[LAST_NAME_IDX].trim();
        if (lname.isEmpty() || lname.length() < 1) {
            throw new IllegalArgumentException("Last name must be atleast 1 character");
        }

        return nameParts[nameParts.length - 1];
    }

    /**
     * Gets the length of a name.
     *
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }

}
