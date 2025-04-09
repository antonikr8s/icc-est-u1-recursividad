import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FuncionesRecursivas obj = new FuncionesRecursivas();

        int opcion;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Suma de numeros consecutivos");
            System.out.println("2. Fibonacci");
            System.out.println("3. Potencia de un numero");
            System.out.println("4. Suma de digitos");
            System.out.println("5. Salir");
            System.out.print("-> Elige una opcion: ");
            opcion = scanner.nextInt();
            //Se asume que el usuario ingresa numeros (positivos o negativos)
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa un numero entero positivo: ");
                    int n1 = scanner.nextInt();
                    int suma = obj.sumaConsecutivos(n1);
                    System.out.println("Resultado: " + suma);
                    break;
                case 2:
                    System.out.print("Ingresa la posicion en la serie Fibonacci: ");
                    int n2 = scanner.nextInt();
                    int fib = obj.fibonacci(n2);
                    System.out.println("Resultado: " + fib);
                    break;
                case 3:
                    System.out.print("Base: ");
                    int base = scanner.nextInt();
                    System.out.print("Exponente: ");
                    int exponente = scanner.nextInt();
                    int pot = FuncionesRecursivas.potencia(base, exponente);
                    System.out.println("Resultado: " + pot);
                    break;
                case 4:
                    System.out.print("Ingresa un numero: ");
                    int num = scanner.nextInt();
                    int sumaDig = FuncionesRecursivas.sumarDigitos(num);
                    System.out.println("Resultado: " + sumaDig);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        } while (opcion != 5);
    }
}
