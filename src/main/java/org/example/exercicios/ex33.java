import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("|     AVALIAÇÃO DE EMPRESTIMO     |");
        System.out.println("-----------------------------------");

        System.out.print("Qual o valor da casa que você quer comprar:");
        float valor_casa = teclado.nextFloat();

        System.out.print("Qual o valor do seu salário atual: ");
        float salario = teclado.nextFloat();

        System.out.print("Em quantos anos vocÊ pretende pagar: ");
        float tempo_de_financiamento = teclado.nextFloat();

        float parcelas_mensais_financiamento = (tempo_de_financiamento*12) / valor_casa;

        float salario_30_por_cento = salario * 0.3f;

        if (salario_30_por_cento > parcelas_mensais_financiamento) {
            System.out.print("Infelizmente o financiamento não pode ser aprovado.");
        } else {
            System.out.print("Parabéns o seu financiamento foi aprovado!");
        }
    }
}
