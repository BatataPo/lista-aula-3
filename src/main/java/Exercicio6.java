import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        int y = entrada.nextInt();
        do{

            if(x>y)
                System.out.println("É maior");
            else if(x<y) {
                System.out.println("É menor");
            }
            y = entrada.nextInt();

        }while(x!=y);

        System.out.println("Parabéns!!!");

    }
}
