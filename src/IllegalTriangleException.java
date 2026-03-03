public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
        super("Los lados no cumplen la regla del triángulo.");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}