import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("|   COMPARAÇÃO DE NÚMEROS   |");
        System.out.println("-----------------------------");

        System.out.print("Digite um valor: ");
        int n1 = teclado.nextShort();

        System.out.print("Digite outro valor: ");
        int n2 = teclado.nextShort();

        if (n1 > n2) {
            System.out.print("O primeiro valor é o maior");
        } else if (n2 > n1) {
            System.out.print("O segundo valor é o maior");
        } else {
            System.out.print("Não existe valor maior, os dois são iguais");
        }
    }
}
