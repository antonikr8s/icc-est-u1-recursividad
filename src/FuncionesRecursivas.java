public class FuncionesRecursivas {

    public int llamadasRecursiva = 1;

    public int sumaConsecutivos(int n) {
        if (n <= 0) {
            return 0;
        }
        int resultadoParcial = sumaConsecutivos(n - 1);
        int resultado = n + resultadoParcial;
        return resultado;
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static int sumarDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumarDigitos(n / 10);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
