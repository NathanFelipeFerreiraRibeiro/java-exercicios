//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO.
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite qualquer ano para saber se ele é bissexto: ");
        int ano = teclado.nextShort();

        if (ano % 4 == 0) {
            System.out.print("Esse ano é BISSEXTO!");
        } else {
            System.out.print("Esse ano NÃO é BISSEXTO");
        }
    }
}
