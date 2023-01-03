package one.digitalinnovation.gof.singleton;

/** Singleton "apressado" **/
//Equivalente ao @Bean e @Autowired no Spring
public class SingletonEager {
    //Ao criar a instancia, ela já é chamada e instanciada novamente
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
