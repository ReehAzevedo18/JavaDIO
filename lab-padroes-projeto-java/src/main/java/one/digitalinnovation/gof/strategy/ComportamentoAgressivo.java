package one.digitalinnovation.gof.strategy;

//Equivalente ao @Service e @Repository no Spring
public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Robô movendo-se agressivamente!");
    }
}
