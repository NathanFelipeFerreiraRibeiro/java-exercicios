import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        float salario;
        int anos_trabalhados;

        System.out.println("-----------------------------");
        System.out.println("|     REAJUSTE SALARIAL     |");
        System.out.println("-----------------------------");

        System.out.print("Nome do funcionário: ");
        nome = teclado.nextLine();

        System.out.print("Salário atual: ");
        salario = teclado.nextFloat();

        System.out.print("A quantos anos trabalha na empresa: ");
        anos_trabalhados = teclado.nextShort();

        if (anos_trabalhados <= 3) {
            System.out.printf("Seu salário com reajuste é %.1f.", salario + (salario*(3f/100)));
        } else if (anos_trabalhados > 3 && anos_trabalhados < 10) {
            System.out.printf("Seu salário com reajuste é %.1f.", salario + (salario*(12.5f/100)));
        } else {
            System.out.printf("Seu salário com reajuste é %.1f.", salario + (salario*(20f/100)));
        }
    }
}
