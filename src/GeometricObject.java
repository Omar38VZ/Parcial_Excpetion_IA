import java.util.Date;

public class GeometricObject {

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    // Constructor sin argumentos
    public GeometricObject() {
        dateCreated = new Date();
    }

    // Constructor con parámetros
    public GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Creado el: " + dateCreated +
               "\nColor: " + color +
               "\nRelleno: " + filled;
    }
}