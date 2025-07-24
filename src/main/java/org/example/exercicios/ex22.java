//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
//- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
//- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.

import java.util.Scanner;
import java.time.LocalDate;

public class ex22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int ano_nascimento = teclado.nextShort();

        int ano_atual = LocalDate.now().getYear();

        if (ano_atual - ano_nascimento < 18) {
            int anos_faltando = 18 - (ano_atual - ano_nascimento);

            System.out.printf("Faltam %d anos para você completar 18 anos e poder se alistar!", anos_faltando);
        } else {
            int anos_passaram = (ano_atual - ano_nascimento) - 18;

            System.out.printf("Já se passaram %d anos desde a data de seu alistamento militar obrigatório!", anos_passaram);
        }
    }
}
