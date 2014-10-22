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
public class NameTooLongException extends IllegalArgumentException {
    private static String msg = "Sorry the name is too long, must be maximum length of ";
    private static int msgLength = 20;
   
    public NameTooLongException() {
        super(msg + msgLength);
    }

    public NameTooLongException(String s) {
        super(msg + msgLength);
    }

    public NameTooLongException(String message, Throwable cause) {
        super(msg + msgLength, cause);
    }

    public NameTooLongException(Throwable cause) {
        super(msg + msgLength, cause);
    }

    public static void setMsgLength(int msgLength) {
       NameTooLongException.msgLength = msgLength;
    }
   
}
