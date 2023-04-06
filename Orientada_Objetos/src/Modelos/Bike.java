package Modelos;

public class Bike {

    private Roda rodaDianteira;
    private Roda rodaTraseira;
    private Quadro QuadroPrincipal;

    //Constructor

    
    public Bike(Roda rodaDianteira_qualquer, Roda rodaTraseira_qualquer, Quadro quadroQualquer) {
        this.rodaDianteira = rodaDianteira_qualquer;
        this.rodaTraseira = rodaTraseira_qualquer;
        this.QuadroPrincipal = quadroQualquer;
    }



    //Getters
    public Roda getRodaDianteira() {
        return rodaDianteira;
    }
    public Roda getRodaTraseira() {
        return rodaTraseira;
    }
    public Quadro getQuadro(){
        return QuadroPrincipal;
    }



}
