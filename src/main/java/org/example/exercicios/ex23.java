//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
//- Homens ganham 5% de desconto
//- Mulheres ganham 13% de desconto

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        char sexo;
        float valor_compra;

        System.out.println("-----------------------------");
        System.out.println("| PROMOÇÃO DIA DAS MULHERES |");
        System.out.println("-----------------------------");

        System.out.print("Qual o seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Qual o seu sexo (M/F): ");
        sexo = teclado.next().charAt(0);

        System.out.print("Qual o valor das suas compras: ");
        valor_compra = teclado.nextFloat();

        if (sexo == 'F') {

            float valor_desconto = valor_compra - (valor_compra * (13f/100));

            System.out.println("Em comemoração ao dia da mulher nossa loja está com uma oferta imperdivel!");
            System.out.println("Estamos dando um desconto de 13% para as mulheres que compram na nossa loja!");
            System.out.printf("O valor das suas compras sem o desconto deram %.2f.", valor_compra);
            System.out.printf("Jà com o nosso desconto ficará %.2f.\n", valor_desconto);
            System.out.println("Parabéns!");
        } else if (sexo == 'M') {

            float valor_desconto = valor_compra - (valor_compra * (5f/100));

            System.out.println("Em comemoração ao dia da mulher nossa loja está com uma oferta imperdivel!");
            System.out.println("Estamos dando um desconto de 5% para os homens que compram na nossa loja!");
            System.out.printf("O valor das suas compras sem o desconto deram %.2f.", valor_compra);
            System.out.printf("Jà com o nosso desconto ficará %.2f.\n", valor_desconto);
            System.out.println("Parabéns!");
        }
    }
}
