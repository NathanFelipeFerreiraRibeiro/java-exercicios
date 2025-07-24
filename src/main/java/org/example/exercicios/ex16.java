import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cigarros;
        int minutos_vida_a_menos = 10;
        int anos_fumando;
        int dias_do_ano = 365;
        int minutos_de_hora = 60;
        int horas_do_dia = 24;

        System.out.println("-----------------------------------");
        System.out.println("|   TEMPO DE VIDA DE UM FUMANTE   |");
        System.out.println("-----------------------------------");

        System.out.print("Quantos cigarros você fuma por dia: ");
        cigarros = teclado.nextShort();

        System.out.print("A quantos anos você fuma: ");
        anos_fumando = teclado.nextShort();

        int dias_de_vida_a_menos = (cigarros*minutos_vida_a_menos) * (anos_fumando*dias_do_ano)/minutos_de_hora/horas_do_dia;

        System.out.printf("Você já pedeu %d dias de vida", dias_de_vida_a_menos);
    }
}
