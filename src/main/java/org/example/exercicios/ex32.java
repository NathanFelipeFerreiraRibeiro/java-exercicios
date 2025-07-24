import java.util.Scanner;
import java.util.Random;

public class ex32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = sortear(1, 5);

        System.out.println("---------------------------");
        System.out.println("|     NÚMERO SORTEADO     |");
        System.out.println("---------------------------");

        System.out.print("Digite um número(de 1 a 5): ");
        int numero_jogador = teclado.nextShort();

        if (numero_jogador == numero) {
            System.out.print("Parabéns você acertou!");
        } else {
            System.out.printf("Não foi dessa vez! O número que você escolheu foi %d e o sorteado foi %d.", numero_jogador, numero);
        }
    }

    public static int sortear(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min +1) + min;
    }
}
