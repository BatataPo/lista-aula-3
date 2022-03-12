public class kart {

    String nome;
    motor motor;
    piloto piloto;

    public kart(){
        motor = new motor();
    }

    void pular() {
        System.out.println("Carro: "+nome+" esta pulando!");
    }
    void soltarTurbo() {
        System.out.println("Carro: " +nome+" esta soltando turbo!");
    }
    void fazerDrift(){
        System.out.println("Carro: "+nome+" esta fazendo drift!");
    }

}
