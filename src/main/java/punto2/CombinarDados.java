package punto2;

public class CombinarDados {
    public static void main(String[] args) {
        int[] dados = { 0,0,0};
        int valorSuperar = 6;
        tiradas(dados, valorSuperar, 0, 0);
    }

    public static void tiradas(int[] dados, int valorSuperar, int suma, int tirada) {
        if (tirada == dados.length) {
            if (suma>valorSuperar) {
                for (int i = 0; i < dados.length; i++) {
                    System.out.print(dados[i]);
                    if (i < dados.length - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println("=" + suma);
            }
        } else {
            for (int i = 1; i <= 6; i++) {
                dados[tirada] = i;
                suma += i;
                tiradas(dados, valorSuperar, suma, tirada + 1);
                suma -= i;
            }
        }
    }
}
