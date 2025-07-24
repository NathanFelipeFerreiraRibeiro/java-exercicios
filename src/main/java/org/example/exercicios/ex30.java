import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float retaA;
        float retaB;
        float retaC;

        System.out.println("-------------------------------");
        System.out.println("|    FORMA UM TRIÂNGULO V2    |");
        System.out.println("-------------------------------");

        System.out.print("Digite o comprimento da reta A: ");
        retaA = teclado.nextFloat();

        System.out.print("Digite o comprimento da reta B: ");
        retaB = teclado.nextFloat();

        System.out.print("Digite o comprimento da reta C: ");
        retaC = teclado.nextFloat();

        if ((retaA <= retaB + retaC) && (retaB <= retaA + retaC) && (retaC <= retaA + retaB)) {
            if ((retaA == retaB) && (retaB == retaC) && (retaC == retaA)) {
                System.out.print("Este é um triângulo EQUILÁTERO: Todos os lados são iguais.");
            } else if ((retaA == retaB) || (retaB == retaC) || (retaC == retaA)) {
                System.out.print("Este é um triângulo ISÓSCELES: dois lados iguais.");
            } else {
                System.out.print("Este é um triângulo ESCALENO: todos os lados diferentes.");
            }
        } else {
            System.out.print("Essas retas NÃO formam um triângulo.");
        }
    }
}
