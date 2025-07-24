//24) Faça um algoritmo que pergunte a distância que um passageiro deseja
//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//viagens até 200Km e R$0.45 para viagens mais longas.

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("| DISTÂNCIA A SER PERCORRIDA |");
        System.out.println("------------------------------");

        System.out.print("Quantos km's você quer percorrer: ");
        float km = teclado.nextFloat();

        if (km <= 200 && km >= 1) {
            float valor = km * 0.5f;

            System.out.printf("Você quer percorrer %.1f km's. Ficará R$%.2f.", km, valor);
        } else if (km > 200) {
            float valor = km * 0.45f;

            System.out.printf("Você quer percorrer %.1f km's. Ficará R$%.2f.", km, valor);
        } else {
            System.out.println("ERRO!");
            System.out.println("Não são aceitos números negativos!");
        }
    }
}
