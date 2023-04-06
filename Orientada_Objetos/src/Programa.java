import Modelos.Bike;
import Modelos.Quadro;
import Modelos.Roda;

public class Programa {
    public static void main(String[] args) throws Exception {
        Roda rodaDianteira_qualquer = new Roda();
        rodaDianteira_qualquer.setCor("vermelha");
        Roda rodaTraseira_qualquer = new Roda();
        rodaTraseira_qualquer.setCor("preta");

        Quadro quadroQualquer = new Quadro();
        quadroQualquer.setCor("preta");


        Bike minhaBike = new Bike(rodaDianteira_qualquer, rodaTraseira_qualquer, quadroQualquer);






        System.out.println("Cor Roda Dianteira: "+minhaBike.getRodaDianteira().getCor());
        System.out.println("Cor Roda Traseira: "+minhaBike.getRodaTraseira().getCor());
        System.out.println("Cor Quadro: "+minhaBike.getQuadro().getCor());

    }
}