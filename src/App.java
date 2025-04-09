import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Instanciamos
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=====Menu Recursividad=====");
            System.out.println("1. Suma de numeros enteros consecutivos");
            System.out.println("2. Potencia de un numero");
            System.out.println("3. Suma de digitos de un numero");
            System.out.println("4. Salir");
            //Se asume que el usuario ingresa numeros positivos o negativos
            System.out.print("\n-> Elige una opcion: ");
            opcion = sc.nextInt();
            System.out.print(" ");

            //Se asume que ingresan numeros
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un numero: ");
                    int n = sc.nextInt();
                    System.out.println("Resultado: " + FuncionesRecursivas.sumarConsecutivos(n));
                    break;
                case 2:
                    System.out.print("Base: ");
                    int base = sc.nextInt();
                    System.out.print("Exponente: ");
                    int exponente = sc.nextInt();
                    System.out.println("Resultado: " + FuncionesRecursivas.potencia(base, exponente));
                    break;
                case 3:
                    System.out.print("Ingresa un numero: ");
                    int numero = sc.nextInt();
                    System.out.println("Suma de digitos: " + FuncionesRecursivas.sumarDigitos(numero));
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: Opcion no valida");
            }

        } while (opcion != 4);
    }
}
