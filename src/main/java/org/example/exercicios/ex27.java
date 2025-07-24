import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("-----------------------------");
        System.out.println("|     SITUAÇÃO DO ALUNO     |");
        System.out.println("-----------------------------");

        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = teclado.nextFloat();

        System.out.print("Digite a segundo nota do aluno: ");
        nota2 = teclado.nextFloat();

        media = (nota1+nota2)/2;

        if (media < 4.9) {
            System.out.printf("O aluno ficou com a média %.1f e foi REPROVADO!", media);
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("O aluno ficou com a média %.1f e está de RECUPERAÇÃO!", media);
        } else {
            System.out.printf("O aluno ficou com a média %.1f e foi APROVADO!", media);
        }
    }
}
