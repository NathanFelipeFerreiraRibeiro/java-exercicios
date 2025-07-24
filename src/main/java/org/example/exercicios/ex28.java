import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("|  CLASSIFICAÇÃO DE TERRENO  |");
        System.out.println("------------------------------");

        System.out.print("Digite a largura do terreno: ");
        float largura = teclado.nextFloat();

        System.out.print("Digite o comprimento do terreno: ");
        float comprimento = teclado.nextFloat();

        float metros = largura * comprimento;

        if (metros < 100f) {
            System.out.print("Este terreno é um TERRENO POPULAR!");
        } else if (metros >= 100 && metros <= 500) {
            System.out.print("Este terreno é um TERRENO MASTER");
        } else {
            System.out.print("Este terreno é um TERRENO VIP");
        }
    }
}
