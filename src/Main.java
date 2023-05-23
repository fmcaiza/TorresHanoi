// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numDiscos = 3;
        resolverTorres(numDiscos, 'A', 'C', 'B');
    }

    public static void resolverTorres(int n, char torreOrigen, char torreDestino, char torreAuxiliar) {
        if (n == 1) {
            moverDisco(torreOrigen, torreDestino);
        } else {
            resolverTorres(n - 1, torreOrigen, torreAuxiliar, torreDestino);
            moverDisco(torreOrigen, torreDestino);
            resolverTorres(n - 1, torreAuxiliar, torreDestino, torreOrigen);
        }
    }

    public static void moverDisco(char torreOrigen, char torreDestino) {
        System.out.println("Mover disco de la torre " + torreOrigen + " a la torre " + torreDestino);
    }
}