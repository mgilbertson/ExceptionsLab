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
public class NameTooShortException extends IllegalArgumentException {
    private static String msg = "Sorry the name is too short, must be minimum length of ";
    private static int msgLength = 1;
   
    public NameTooShortException() {
        super(msg + msgLength);
    }

    public NameTooShortException(String s) {
        super(msg + msgLength);
    }

    public NameTooShortException(String message, Throwable cause) {
        super(msg + msgLength, cause);
    }

    public NameTooShortException(Throwable cause) {
        super(msg + msgLength, cause);
    }

    public static void setMsgLength(int msgLength) {
       NameTooShortException.msgLength = msgLength;
    }
   
}
