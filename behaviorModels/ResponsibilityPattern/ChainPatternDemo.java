public class ChainPatternDemo {

    private static AbstractLogger getChainLoggers(){
        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.);
        AbstractLogger consoleLogger = new ConsoleLogger();

        errorLogger.setNext();

    }

    public static void main(String[] args){

    }
}