import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("|     IMC     |");
        System.out.println("---------------");

        System.out.println("Calcule o seu índice de massa corporal.");

        System.out.print("Digite seu peso: ");
        float peso = teclado.nextFloat();

        System.out.print("Digite sua altura: ");
        float altura = teclado.nextFloat();

        float imc = (float) ((float) peso/Math.pow(altura,2));

        if (imc < 18.5) {
            System.out.println("Você está: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com: Peso  ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com: Sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Você está com: Obesidade");
        } else {
            System.out.println("Você está com: Obesidade mórbida");
        }


    }


}
