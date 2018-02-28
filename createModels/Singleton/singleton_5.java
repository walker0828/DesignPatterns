/*
* 静态内部类 单例
* */
public class Singleton_5 {
    private static class SingletonHolder {
        private static final Singleton_5 INSTANCE = new Singleton_5();
    }

    private Singleton_5(){};

    public static Singleton_5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}