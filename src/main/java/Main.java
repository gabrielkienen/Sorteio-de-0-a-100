import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 0 e 100: ");
        int palpite;

        do {
            tentativas++;
            System.out.print("Tentativa " + tentativas + ": ");
            palpite = scanner.nextInt();

            if (palpite < numeroSorteado) {
                System.out.println("O número é maior.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número é menor.");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
    }
}