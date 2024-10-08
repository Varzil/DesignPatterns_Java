package Singleton_2;
public class Singleton {
    private static volatile Singleton obj  = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (obj == null){
            synchronized (Singleton.class){
                if (obj==null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}