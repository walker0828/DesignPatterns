/**
 * 双锁 单例
 */
public class Singleton_4 {
    private static volatile Singleton_4 instance;

    private Singleton_4(){};

    public static Singleton_4 getInstance() {
        if(instance==null){
            synchronized (Singleton_4.class){
                instance = new Singleton_4();
            }
        }
        return instance;
    }
}