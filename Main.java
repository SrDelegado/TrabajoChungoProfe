import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese la primera palabra: ");
                    String palabra1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String palabra2 = scanner.nextLine();
                    System.out.println("Resultado de juntar ambas palabras es: " + palabra1 + palabra2);
                }
                case 2: {
                    System.out.print("Ingrese una frase: ");
                    String frase = scanner.nextLine();
                    String[] palabras = frase.split("\\s+");
                    System.out.println("La frase contiene " + palabras.length + " palabras.");
                }
                case 3: {
                    System.out.print("Ingrese una frase: ");
                    String frase = scanner.nextLine();
                    System.out.print("Ingrese una letra: ");
                   char letra = scanner.next().charAt(0);
                    long contador = frase.chars().filter(ch -> ch == letra).count();
                    System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
                }
                case 4: {
                    System.out.print("¿Está seguro que desea salir? (s/n): ");
                    String confirmacion = scanner.nextLine();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        salir = true;
                        System.out.println("¡Hasta luego!");
                    }

                    }
                }
            }
        }
    }

