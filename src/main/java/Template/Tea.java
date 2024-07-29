package Template;

public class Tea extends Beverages {

    public Tea(){
        super();
    }

    @Override
    void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
