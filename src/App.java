import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese lado 1: ");
            double s1 = scanner.nextDouble();

            System.out.print("Ingrese lado 2: ");
            double s2 = scanner.nextDouble();

            System.out.print("Ingrese lado 3: ");
            double s3 = scanner.nextDouble();

            scanner.nextLine(); // limpiar buffer

            System.out.print("Ingrese color: ");
            String color = scanner.nextLine();

            System.out.print("¿Está relleno? (true/false): ");
            boolean filled = scanner.nextBoolean();

            Triangle triangle = new Triangle(s1, s2, s3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println("\n--- Datos del Triángulo ---");
            System.out.println(triangle);
            System.out.println("Área: " + triangle.getArea());
            System.out.println("Perímetro: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Relleno: " + triangle.isFilled());

        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        }

        scanner.close();
    }
}