package Singleton;

public class SimpleLocking {
//    private SimpleLocking(){
//        System.out.println("Constructor called");
//    }
//    private static SimpleLocking uniqueInstance;
//
//    public static SimpleLocking getUniqueInstance() {
//        synchronized (SimpleLocking.class){
//            if(uniqueInstance == null){
//                uniqueInstance = new SimpleLocking();
//            }
//        }
//        return uniqueInstance;
//    }


    private SimpleLocking(){
        System.out.println("Constructor called");
    }
    private volatile static SimpleLocking uniqueInstance;
    public static SimpleLocking getUniqueInstance() {
        if(uniqueInstance==null){
        synchronized (SimpleLocking.class){
            if(uniqueInstance == null){
                uniqueInstance = new SimpleLocking();
            }
        }
    }
        return uniqueInstance;
    }
}
