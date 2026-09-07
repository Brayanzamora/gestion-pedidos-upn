import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();

       
        productos.add(new Producto("Café Americano", 7.50));
        productos.add(new Producto("Sandwich Mixto", 12.00));
        productos.add(new Producto("Jugo de Naranja", 6.50));

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=================================");
            System.out.println("  SISTEMA DE GESTIÓN DE PEDIDOS  ");
            System.out.println("=================================");
            System.out.println("1. Mostrar lista de productos");
            System.out.println("2. Registrar nuevo producto");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción (1-3): ");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos disponibles.");
                    } else {
                        for (int i = 0; i < productos.size(); i++) {
                            System.out.printf("[%d] ", i + 1);
                            productos.get(i).mostrarDetalle();
                        }
                    }
                    break;

                case "2":
                    System.out.println("\n--- REGISTRAR PRODUCTO ---");
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine().trim();

                    double precio = 0.0;
                    boolean valido = false;

                    while (!valido) {
                        System.out.print("Ingrese precio: ");
                        try {
                            precio = Double.parseDouble(scanner.nextLine().trim());
                            if (precio <= 0) {
                                System.out.println("El precio debe ser mayor a 0.");
                            } else {
                                valido = true;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Ingrese un valor numérico válido.");
                        }
                    }

                    productos.add(new Producto(nombre, precio));
                    System.out.println("-> ¡Producto agregado correctamente!");
                    break;

                case "3":
                    System.out.println("\nCerrando el sistema. ¡Hasta luego!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}