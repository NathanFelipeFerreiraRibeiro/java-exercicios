import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float retaA, retaB, retaC;

        System.out.println("-------------------------------");
        System.out.println("|     FORMA UM TRIÂNGULO      |");
        System.out.println("-------------------------------");

        System.out.print("Digite o cumprimento da reta A: ");
        retaA = teclado.nextFloat();

        System.out.print("Digite o cumprimento da reta B: ");
        retaB = teclado.nextFloat();

        System.out.print("Digite o cumprimento da reta C: ");
        retaC = teclado.nextFloat();

        if ( (retaA <= (retaB + retaC)) && (retaB <= (retaA + retaC)) && (retaC <= (retaA + retaB)) ){
            System.out.println("Essas retas formam um triângulo");
        } else {
            System.out.println("Essas retas NÃo formam um triângulo");
        }
    }
}
