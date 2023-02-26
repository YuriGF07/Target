import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Lendo a string a ser invertida
            System.out.print("Digite uma string: ");
            String original = scanner.nextLine();

            // Convertendo a string para um array de caracteres
            char[] caracteres = original.toCharArray();

            // Invertendo os caracteres do array
            int n = caracteres.length;
            for (int i = 0; i < n / 2; i++) {
                char temp = caracteres[i];
                caracteres[i] = caracteres[n - i - 1];
                caracteres[n - i - 1] = temp;
            }

            // Criando a string invertida a partir do array de caracteres
            String invertida = new String(caracteres);

            // Exibindo a string invertida
            System.out.println("String invertida: " + invertida);
        }
    }
}