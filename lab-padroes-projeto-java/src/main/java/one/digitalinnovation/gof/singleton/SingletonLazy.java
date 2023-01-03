package one.digitalinnovation.gof.singleton;

/**Singleton "preguiçoso"**/
//Equivalente ao @Bean e @Autowired no Spring
public class SingletonLazy {

    private static SingletonLazy instancia;

    //Ninguem de fora consegue instanciar essa classe
    private SingletonLazy(){
        super();
    }
    //Ela só será instanciada quando for utilizado o método público
    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
