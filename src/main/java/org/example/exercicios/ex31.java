import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("|     PEDRA-PAPEL-TESOURA     |");
        System.out.println("-------------------------------");

        String jogador1;
        String jogador2;

        System.out.print("Jogador 1 faça sua jogada: ");
        jogador1 = teclado.nextLine();

        System.out.print("Jogador 2 faça sua jogada: ");
        jogador2 = teclado.nextLine();

        if (((jogador1.equals("pedra") && jogador2.equals("tesoura")) || (jogador1.equals("papel") && jogador2.equals("pedra")) || jogador1.equals("tesoura") && jogador2.equals("papel"))) {
            System.out.println("Jogador 1 GANHOU! PARABÉNS!");
        } else {
            System.out.println("Jogador 2 GANHOU! PARABÉNS!");
        }
    }
}
