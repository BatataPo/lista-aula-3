import jdk.swing.interop.SwingInterOpUtils;

public class Exercico1 {
    public static void main(String[] args) {
        int zumbi1 = 120;
        int zumbi2 = 240;
        int zumbi3 = 320;

        int total = 0;
        total = zumbi1+zumbi2+zumbi3;

        System.out.println("Total de zumbis:"+total);
        System.out.println("Media: "+ total/3);    
    }
}
