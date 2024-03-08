import java.util.Random;

public class Main {
    private static StringBuilder dezena = new StringBuilder();
    private static char caracterAleatorio;
    private static Random random = new Random();
    //    private static Array
    private static final String caracteres = "0123456789";
    private static String primeiraDezena;
    private static String segundaDezena;
    private static String terceiraDezena;
    private static String quartaDezena;
    private static String quintaDezena;
    private static String sextaDezena;

    public static void main(String[] args) {
        primeiraDezena = setDezena();
        segundaDezena = setDezena();
        terceiraDezena = setDezena();
        quartaDezena = setDezena();
        quintaDezena = setDezena();
        sextaDezena = setDezena();

        System.out.printf("%s - %s - %s - %s - %s - %s",
                primeiraDezena, segundaDezena, terceiraDezena, quartaDezena, quintaDezena, sextaDezena);
    }

    public static String setDezena() {
        dezena.delete(0, dezena.length());
        while (dezena.toString().length() < 2) {
            if (dezena.toString().startsWith("6") ||
                    dezena.toString().startsWith("7") ||
                    dezena.toString().startsWith("8") ||
                    dezena.toString().startsWith("9")
            ) {
                dezena.delete(0, dezena.length());
                continue;
            } else if (dezena.toString().equals("00") ||
                    dezena.toString().equals("11") ||
                    dezena.toString().equals("22") ||
                    dezena.toString().equals("33") ||
                    dezena.toString().equals("44") ||
                    dezena.toString().equals("55")
            ) {
                dezena.delete(0, dezena.length());
                continue;
            }
            caracterAleatorio = caracteres.charAt(random.nextInt(caracteres.length()));
            dezena.append(caracterAleatorio);
        }
        return dezena.toString();
    }
}
