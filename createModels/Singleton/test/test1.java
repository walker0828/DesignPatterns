/*
* 将 懒汉式 的线程安全 和 非线程 的两种方式 进行 测试
* */

public class test1{
    public static void main(String[] arg){
        new Thread(){
            public void run(){

            }
        }.start();
    }
}