import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("|     ALUGUEL DE CARROS     |");
        System.out.println("-----------------------------");

        System.out.print("Que tipo de carro você quer, LUXO[L] ou POPULAR[P]: ");
        char tipo_de_carro = teclado.next().charAt(0);

        float km = 0;
        float valor = 0;

        if (tipo_de_carro == 'P') {
            System.out.print("Quantos km's você percorreu:");
            km = teclado.nextFloat();

            if (km <= 100) {
                valor = (float) ((float)km * 0.2);

                    System.out.printf("Você pegou um carro POPULAR e rodou %.1fkm com ele. O valor que você tem a paga é R$", km, valor);
                } else {
                valor = (float) ((float)km * 0.1);

                System.out.printf("Você pegou um carro de LUXO e rodou %.1fkm com ele. O valor que você tem a paga é R$", km, valor);  
            }
        } else if () {
            
        }
    }
}
