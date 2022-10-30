final class SingletonClass{
    private static SingletonClass singleton;

    private SingletonClass(){

    }

    public SingletonClass getSingletonInstance(){
        if(singleton == null){
            singleton = new SingletonClass();
            return singleton;
        }
        return singleton;
    }
}

public class Singleton {
    public static void main(String[] args) {
        
    }
}
