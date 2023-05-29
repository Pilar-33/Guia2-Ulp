
import java.util.Scanner;

public class GuiaA {

    public static Scanner entrada = new Scanner(System.in);

    /*
     * 1. Escribir un método que pida dos números enteros por teclado y calcule la
     * suma de los dos
     * mostrando por consola la suma de los mismos.
     */

    public static void suma() {

        // Pidiendo dos números por pantalla
        System.out.println("\nIngrese dos números para suma");

        System.out.print("Primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Segundo número: ");
        int num2 = entrada.nextInt();

        // Operación suma
        int suma = num1 + num2;

        // Mostrando resultado de la suma por pantalla
        System.out.println("La suma de: " + num1 + " + " + num2 + " = " + suma);

    }

    /*
     * 2. Escribir un método que pida tu nombre, lo guarde en una variable y lo
     * muestre por pantalla.
     */
    public static void nombre() {

        // Pidiendo nombre por pantalla
        System.out.print("\nIngrese su nombre: ");
        String nombre = entrada.next();

        System.out.println("Tu nombre es: " + nombre);
    }

    /*
     * 3. Escribir un método que pida una frase y la muestre toda en mayúsculas y
     * después toda en
     * minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la
     * clase String.
     */

    public static void mayusMinus() {

        // Pidiendo frase por pantalla
        System.out.print("\nIngrese una frase: ");
        String frase = entrada.nextLine();

        // Conviertiendo a mayúsculas
        String mayu = frase.toUpperCase();

        // Conviertiendo a minúsculas
        String minus = frase.toLowerCase();

        // Mostrando por pantalla
        System.out.println("La frase en mayúsculas es: " + mayu);
        System.out.println("La frase en minúsculas es: " + minus);

        // otra forma de mostrar por pantalla
        System.out.println("\nLa frase en mayúsculas es: " + frase.toUpperCase());
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase());
    }

    /*
     * 4. Escribir un método que dada una cantidad de grados centígrados se debe
     * mostrar su equivalente
     * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */

    public static void convertir() {

        // Pidiendo grados centígrados por pantalla

        System.out.println("\nConversor de grados centigrados a grados fahrenheit");
        System.out.println("-----------------------------------------------------");

        // Pedir por pantalla temperatura
        System.out.print("Ingrese la temperatura: C° ");
        double temp = entrada.nextDouble();

        // Operación de conversión
        double fara = 32 + (9 * temp / 5);

        // Mostrar por pantalla
        System.out.println("La temperatura en grados Fahrenheit es: " + fara+" F°");

    }

    /* 5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
        triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt(). */

        public static void leeNum(){

            // Pidiendo número por pantalla
            System.out.print("\nIngrese un número entero: ");
            double numero = entrada.nextDouble();

            // Operación de doble, triple,  raíz cuadrada
            System.out.println("El doble del número: "+numero+" ^ 2 = "+Math.pow(numero, 2));
            System.out.println("El triple del número: "+numero+" ^ 3 = "+Math.pow(numero, 3));
            System.out.println("La raíz cuadrada del número: "+numero+" ^ (1/2) = "+Math.sqrt(numero));

        }



}
