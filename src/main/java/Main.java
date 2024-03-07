import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    private static StringBuilder combinacao = new StringBuilder();
    private static final String numeros = "0123456789";
    private static StringBuilder primeiraDezena =  new StringBuilder();
    private static StringBuilder segundaDezena =  new StringBuilder();
    private static StringBuilder terceiraDezena =  new StringBuilder();
    private static StringBuilder quartaDezena =  new StringBuilder();
    private static StringBuilder quintaDezena =  new StringBuilder();
    private static StringBuilder sextaDezena =  new StringBuilder();
    private static ArrayList<String> combinacoesSorteadas = new ArrayList<String>();
    private static char numeroAleatorio;
    private static final int quantidadeNumerosParaSortear = 12;
    private static int quantidadeNumerosSorteados = 0;
    private static int quantidadeDeCombinacoesDesejadas = 1;
    private static int quantidadeDeCombinacoesFeitas = 0;
    private static boolean usarPadrao = false;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    private static final int numeroMaximo = 60;

    public static void main(String[] args) {
        setPrimeiraDezena();
        setSegundaDezena();

        if (segundaDezena.equals(primeiraDezena)){
            segundaDezena.delete(0, segundaDezena.length());
            setSegundaDezena();
        }
        setTerceiraDezena();
        if (terceiraDezena.equals(segundaDezena)){
            terceiraDezena.delete(0, terceiraDezena.length());
            setTerceiraDezena();
        }
        setQuartaDezena();
        if (quartaDezena.equals(terceiraDezena)){
            quartaDezena.delete(0, quartaDezena.length());
            setQuartaDezena();
        }
        setQuintaDezena();
        if (quintaDezena.equals(quartaDezena)){
            quintaDezena.delete(0, quintaDezena.length());
            setQuintaDezena();
        }
        setSextaDezena();
        if (sextaDezena.equals(quintaDezena)){
            sextaDezena.delete(0, sextaDezena.length());
            setSextaDezena();
        }

        combinacao.append(primeiraDezena);
        combinacao.append(segundaDezena);
        combinacao.append(terceiraDezena);
        combinacao.append(quartaDezena);
        combinacao.append(quintaDezena);
        combinacao.append(sextaDezena);
        System.out.println(combinacao);
    }

    public static void setPrimeiraDezena() {
        while (primeiraDezena.length() < 2) {
            numeroAleatorio = numeros.charAt(random.nextInt(numeros.length()));
            primeiraDezena.append(numeroAleatorio);
        }
    }

    public  static  void setSegundaDezena(){
        while (segundaDezena.length() < 2) {
            numeroAleatorio = numeros.charAt(random.nextInt(numeros.length()));
            segundaDezena.append(numeroAleatorio);
        }
    }
    public  static  void setTerceiraDezena(){
        while (terceiraDezena.length() < 2) {
            numeroAleatorio = numeros.charAt(random.nextInt(numeros.length()));
            terceiraDezena.append(numeroAleatorio);
        }
    }
    public  static  void setQuartaDezena(){
        while (quartaDezena.length() < 2) {
            numeroAleatorio = numeros.charAt(random.nextInt(numeros.length()));
            quartaDezena.append(numeroAleatorio);
        }
    }
    public  static  void setQuintaDezena(){
        while (quintaDezena.length() < 2) {
            numeroAleatorio = numeros.charAt(random.nextInt(numeros.length()));
            quintaDezena.append(numeroAleatorio);
        }
    }
    public  static  void setSextaDezena(){
        while (sextaDezena.length() < 2) {
            numeroAleatorio = numeros.charAt(random.nextInt(numeros.length()));
            sextaDezena.append(numeroAleatorio);
        }
    }
}
