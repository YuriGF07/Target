import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = input.nextInt();

        int a = 0;
        int b = 1;
        int fib = 0;

        while (fib < numero) {
            fib = a + b;
            a = b;
            b = fib;
        }

        if (fib == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        input.close();
    }
}