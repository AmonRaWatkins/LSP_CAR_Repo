package Org.howard.edu.lsp.assignment6;

public class IntegerSetException extends Exception {
    // Add the serialVersionUID field
    private static final long serialVersionUID = 1L; // You can change the number if necessary

    // Constructor
    public IntegerSetException(String message) {
        super(message); // Pass the message to the superclass constructor
    }
}