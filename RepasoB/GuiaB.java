import java.util.Scanner;

public class GuiaB {

  public static Scanner entrada = new Scanner(System.in);

  /*
   * 6. Implementar un método que reciba por parámetro dos números enteros y
   * determine cuál es
   * el mayor y lo muestre por pantalla.
   */

  public static void num(int a, int b) {
    // todo: cuidado con la llaves
    // !

    if (a > b) {
      System.out.println("\nEl número mayor de " + a + " y " + b + " es: " + a);
    } else {
      System.out.println("\nEl número mayor de " + a + " y " + b + " es: " + b);
    }
  }

  /*
   * 7. Crear un método que reciba por parámetro un numero y determine si es par o
   * impar.
   */

  public static void num1(int a) {
    if (a % 2 == 0) {
      System.out.println("\nEl numero " + a + " es par.");
    } else {
      System.out.println("\nEl numero " + a + " es impar.");
    }
  }

  /*
   * 8. Crear un método que pida una frase por teclado y si esa frase es igual a
   * “eureka” pondrá un
   * mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
   * el método equals()
   * de String.
   */

  public static void comparaTexto() {
    String secreta = "eureka";

    System.out.print("\nIngrese una frase: ");
    String frase = entrada.nextLine();

    if (frase.equals(secreta)) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
  }

  /*
   * 9. Realizar un método que solo permita introducir frases o palabras de 8
   * caracteres de largo. Si el
   * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un
   * mensaje por pantalla
   * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
   * Nota: investigar
   * el método lenght() de String.
   */

  public static void frase() {
    System.out.print("\nIngrese una frase o palabra: ");
    String frase1 = entrada.nextLine();

    // int largo = frase1.length();

    if (frase1.length() == 8) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }
  }

  /*
   * 10. Escriba un método que pida una frase o palabra y valide si la primera
   * letra de esa frase es una
   * ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
   * pantalla que diga
   * “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
   */

  public static void validarA() {
    System.out.print("\nIngrese una frase o palabra: ");
    String frase = entrada.nextLine();

    if (frase.length() > 0) {
      if (frase.charAt(0) == 'A' || frase.charAt(0) == 'a') {
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
      }
    } else {
      System.out.println("La frse está vacia");
    }
  }

  /*
   * 11. Considera que estás desarrollando una web para una empresa que fabrica
   * motores (suponemos
   * que se trata del tipo de motor de una bomba para mover fluidos). En un nuevo
   * método definir una
   * variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El
   * método debe mostrar
   * lo siguiente:
   *  Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
   * bomba de agua”.
   *  Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
   * bomba de
   * gasolina”.
   *  Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
   * bomba de
   * hormigón”.
   *  Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
   * bomba de pasta
   * alimenticia”.
   *  Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
   * existe un valor
   * válido para tipo de bomba”
   */

  public static void tipoMotor() {

    System.out.print("\nIngrese el tipo de motor (1 al 4): ");
    int tipoMotor = entrada.nextInt();

    switch (tipoMotor) {
      case 1:
        System.out.println("La bomba es una bomba de agua");

        break;

      case 2:
        System.out.println("La bomba es una bomba de gasolina");
        break;

      case 3:
        System.out.println("La bomba es una bomba de hormigón");
        break;

      case 4:
        System.out.println("La bomba es una bomba de pasta alimenticia");
        break;

      default:
        System.out.println("No existe un valor válido para tipo de bomba");
        break;
    }
  }

}
