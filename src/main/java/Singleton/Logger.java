package Singleton;

public class Logger {
    private Logger() {
        System.out.println("Constructor called");
    }

    private static Logger uniqueInstance;

    public static Logger getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Logger();
        }
        return uniqueInstance;
    }
}
