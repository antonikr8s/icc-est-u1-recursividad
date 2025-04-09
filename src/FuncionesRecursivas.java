public class FuncionesRecursivas {
    public static int sumarConsecutivos(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sumarConsecutivos(n - 1);//
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
}
