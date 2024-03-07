import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    private static StringBuilder combinacao = new StringBuilder();
    private static final String numeros = "0123456789";
    private static ArrayList<String> combinacoesSorteadas = new ArrayList<String>();
    private static char numeroAleatorio;
    private static final int quantidadeNumerosParaSortear = 12;
    private static int quantidadeNumerosSorteados = 0;
    private static int quantidadeDeCombinacoesDesejadas = 1;
    private static int quantidadeDeCombinacoesFeitas = 0;
    private static boolean usarPadrao = true;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    private static final int numeroMaximo = 60;

    public static void main(String[] args) {
        setNumerosSorteados();
    }

    public static void setNumerosSorteados() {
        if (!usarPadrao) {
            while (quantidadeDeCombinacoesFeitas < quantidadeDeCombinacoesDesejadas) {

                while (combinacao.length() < quantidadeNumerosParaSortear) {
                    numeroAleatorio = numeros.charAt(random.nextInt(numeros.length()));
                    combinacao.append(numeroAleatorio);
                    if (combinacao.length() == 12) {
                        combinacoesSorteadas.add(combinacao.toString());
                        combinacao.delete(0, combinacao.length());
                    }
                }
            }
        }
        System.out.println(combinacoesSorteadas);
    }
}
