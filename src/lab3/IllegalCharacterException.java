/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Mitch
 */
public class IllegalCharacterException extends IllegalArgumentException {
    private static String msg = "Sorry, your name entry must only contain letters";
   
    public IllegalCharacterException() {
        super(msg);
    }

    public IllegalCharacterException(String s) {
        super(msg);
    }

    public IllegalCharacterException(String message, Throwable cause) {
        super(msg, cause);
    }

    public IllegalCharacterException(Throwable cause) {
        super(msg, cause);
    }
   
}
