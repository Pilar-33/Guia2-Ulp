import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class GuiaC {

    // Instanciondo Scanner general para todo el ejercicio
    public static Scanner entrada = new Scanner(System.in);

    /*
     * 12. Escriba un método que valide si una nota ingresada por teclado está entre
     * 0 y 10, sino está
     * entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
     */

    public static void validaNota() {
        // Declaración de variables
        boolean respuesta = false;

        while (!respuesta) {
            System.out.print("\nIngrese nota entre 0 y 10: ");
            int nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota ingresada es válida: " + nota);
                break;

            } else {
                System.out.println("Nota ingresada no es válida. Intente de nuevo");
                continue;
            }
        }
    }

    /*
     * 13. Escriba un método en el cual se ingrese un valor límite positivo, y a
     * continuación solicite
     * números al usuario hasta que la suma de los números introducidos supere el
     * límite inicial.
     */

    public static void ingresaLimite() {
        // ! Tiene errores porque agrega los números negativos

        System.out.print("\nIngrese un valor límite positivo: ");
        int limite = entrada.nextInt();
        int suma = 0;
        int contador = 0;

        while (suma <= limite) {

            System.out.print("Ingrese un número: ");
            int num = entrada.nextInt();

            // todo: corregido con un if
            if (num > 0) {
                suma += num;
                contador++;
            }

        }

        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("La cantidad de números ingresados es: " + contador);

    }

    /* 13.1 Ejercicio modificado con booleano y break y continue */

    public static void limite() {
        boolean respuesta = false;
        int suma = 0;
        int contador = 0;

        System.out.print("\nIngrese un valor positivo límite: ");
        int limite = entrada.nextInt();

        while (!respuesta) {
            System.out.print("Ingrese un número: ");
            int num = entrada.nextInt();

            if (num <= 0) {
                System.out.println("El número ingresado no es válido. Intente de nuevo");
                continue;
            }

            if (num > 0) {
                suma += num;
                contador++;
            }

            if (suma > limite) {
                break;
            }

        }

        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("La cantidad de números ingresados es: " + contador);

    }

    /*
     * 14. Realizar un método que pida dos números enteros positivos por teclado y
     * muestre por pantalla
     * el siguiente menú:
     * MENU
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * 5. Salir
     * Elija opción:
     * 
     * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
     * por pantalla y luego
     * volver al menú. El método deberá ejecutarse hasta que se elija la opción 5.
     * Tener en cuenta que,
     * si el usuario selecciona la opción 5, en vez de salir del programa
     * directamente, se debe mostrar el
     * siguiente mensaje de confirmación: ¿Está seguro que desea salir (S/N)? Si el
     * usuario selecciona
     * el carácter ‘S’ termina, caso contrario se vuelve a mostrar el menú.
     */
    public static void menu() {
        System.out.println("MENU DE OPERACIONES MATEMATICAS");
        System.out.println("-------------------------------");
        System.out.println("1. Sumar        2. Restar");
        System.out.println("3. Multiplicar  4. Dividir");
        System.out.println("          5. Salir");
        System.out.println("-------------------------------");
    }

    public static void operaciones() {

        int opcion = 0;
        boolean salir = false;
        System.out.print("\nIngrese dos números enteros positivos: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        while (!salir) {

            menu();
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los números: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    System.out.println();

                    break;

                case 2:
                    System.out.println("La resta de los números: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    System.out.println();

                    break;

                case 3:
                    System.out.println(
                            "La multiplicación de los números: " + num1 + " x " + num2 + " = " + (num1 * num2));

                    break;

                case 4:
                    if (num2 != 0) {

                        double division = (double) (num1 / num2);

                        System.out.println("La división de los números: " + num1 + " / " + num2 + " = " + division);

                    } else {

                        System.out.println("No se puede dividir por cero");
                    }

                    break;

                case 5:
                    Scanner salida = new Scanner(System.in);

                    System.out.print("\nEstá seguro de salir?(S/N): ");
                    String confirmacion = salida.nextLine();

                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("Hasta luego");
                        salir = true;

                    } else if (confirmacion.equalsIgnoreCase("N")) {

                        break;

                    }

                    break;

                default:
                    System.out.println("Opción invalida!!");

                    break;

            }

        }

    }

    /*
     * 15. Escriba un método que lea 20 números. Si el número leído es igual a cero
     * se debe salir del
     * bucle y mostrar el mensaje "Se capturó el número cero". El método deberá
     * calcular y mostrar el
     * resultado de la suma de los números leídos, pero si el número es negativo no
     * debe sumarse. Nota:
     * recordar el uso de la sentencia break.
     */

    public static void leaNumeros() {

        int suma = 0;
        int contador = 0;

        while (contador < 20) {

            System.out.print("\nIngrese un número: ");
            int num = entrada.nextInt();

            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;

            }

            if (num < 0) {

                continue;

            }

            suma += num;
            contador++;
        }

        System.out.println("La suma de los números ingresados: " + suma);
        System.out.println("La cantidad de números ingresados es: " + contador);

    }

    /*
     * 16. Escribir un método que simule el funcionamiento de un dispositivo RS232,
     * este tipo de
     * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con
     * un formato fijo:
     * tienen que ser de un máximo de 5 caracteres de largo, el primer carácter
     * tiene que ser X y el último
     * tiene que ser una O.
     * Las secuencias leídas que respeten el formato se consideran correctas, la
     * secuencia especial
     * “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
     * distinta de FDE, que
     * no respete el formato se considera incorrecta. Al finalizar el proceso, se
     * imprime un informe
     * indicando la cantidad de lecturas correctas e incorrectas recibidas. Para
     * resolver el ejercicio deberá
     * investigar cómo se utilizan los siguientes métodos de la clase String:
     * Substring(), Length(),
     * equals().
     */

    public static void R5232() {

        int correcta = 0;
        int incorrecta = 0;

        System.out.println("\nLa cadena debe tener el primer caracter tiene que ser una  X y el ultimo una O:");
        System.out.print("Ingrese una cadena de 8 caracteres: ");
        String cadena = entrada.next();

        while (!cadena.equals("&&&&&")) {

            if (cadena.length() == 5 && cadena.substring(0, 1).equals("x") && cadena.endsWith("o")) {

                correcta++;

            } else {
                incorrecta++;
            }

            System.out.print("Ingrese una cadena de 8 caracteres: ");
            cadena = entrada.next();

        }

        System.out.println("Cadenas correctas: " + correcta);
        System.out.println("Cadenas incorrectas: " + incorrecta);

    }

    /*
     * 17. Crear un método que dibuje un cuadrado de N elementos por lado utilizando
     * el carácter “*”.
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
     * siguiente:
     * * * *
     * *
     * *
     * * * *
     * El valor de N se ingresará por teclado y en este caso utilice la estructura
     * while para dibujarlo.
     */

    public static void dibujaCuadrado() {

        System.out.print("\nIngrese el tamanio del cuadrado: ");
        int N = entrada.nextInt();
        System.out.println();

        for (int columna = 0; columna < N; columna++) {
            for (int fila = 0; fila < N; fila++) {
                if (columna == 0 || columna == N - 1 || fila == 0 || fila == N - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");

        }

    }

    public static void dibCuadrado() {

        System.out.print("\nIngrese el tamanio del cuadrado: ");
        int num = entrada.nextInt();
        System.out.println();

        int i = 1;

        while (i <= num) {

            int j = 1;
            while (j <= num) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;

        }

    }

    /*
     * 18. Realizar un método que lea 4 números (comprendidos entre 1 y 20) e
     * imprima el número
     * ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
     * 5 *****
     * 3 ***
     * 11 ***********
     * 2 **
     */
    public static void imprimirNumerosConAsteriscos() {
        System.out.println("Ingrese 4 números entre 1 y 20:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = entrada.nextInt();
            System.out.print(numero + " ");

            if (numero >= 1 && numero <= 20) {
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("Número inválido. Ingrese nuevamente.");
                i--; // Decrementar el contador para repetir la iteración
            }
        }
    }

    // 18.1 otra forma de realizar con array
    public static void imprimirConAsteriscos() {
        System.out.println("Ingrese 4 números entre 1 y 20:");
        int[] numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] < 1 || numeros[i] > 20) {
                System.out.println("Número inválido. Ingrese nuevamente.");
                i--; // Decrementar el contador para repetir la iteración
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
