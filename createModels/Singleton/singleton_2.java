/*
* 懒汉式 单例 线程安全
* */
public class Singeton_2{
    private static Singeton_2 instance;

    private Singeton_2(){};

    public static synchronized Singeton_2 getInstance(){
        if(instance==null){
            instance = new Singeton_2();
        }
        return instance;
    }
}