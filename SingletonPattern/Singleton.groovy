public class Singleton{
    private Singleton(){}

    private static Singleton is_unique
    public static synchronized Singleton getinstance(){
        if(is_unique==null){
            is_unique = new Singleton()
        }
        return is_unique
    }
}