import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("Digite outro numero: ");
        int numero3 = entrada.nextInt();

        int totalZumbis = numero1 + numero2 + numero3;

        System.out.println("Numero Zumbis derrotados: " +totalZumbis/3);

        entrada.close();
    }
}
