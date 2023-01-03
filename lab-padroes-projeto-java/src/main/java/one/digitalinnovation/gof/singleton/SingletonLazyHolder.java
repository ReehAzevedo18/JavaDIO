package one.digitalinnovation.gof.singleton;

/**Singleton "preguiçoso"**/
//Equivalente ao @Bean e @Autowired no Spring
public class SingletonLazyHolder {

    //NEsse caso é encapsulado a instancia dentro de uma inner class
    public static class Holder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return Holder.instancia;
    }
}
