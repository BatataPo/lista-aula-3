public class main {

    public static void main(String[] args) {

        kart kart1 = new kart();
        kart kart2 = new kart();

        kart1.nome = "kart1";
        kart2.nome = "kart2";

        kart1.motor.velocidadeMaxima = 102.02f;
        kart1.motor.Cilindradas = "200";

        kart2.motor.velocidadeMaxima = 115.0f;
        kart2.motor.Cilindradas = "250";

        piloto piloto1 = new piloto();
        piloto piloto2 = new piloto();

        piloto1.nome = "piloto1";
        piloto2.nome = "piloto2";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.SoltaSuperPoder();
        piloto2.SoltaSuperPoder();

        kart1.fazerDrift();
        kart2.fazerDrift();
        kart1.pular();
        kart2.pular();
        kart1.soltarTurbo();
        kart2.soltarTurbo();

        kart1.motor.mostraInfo();

    }
}
