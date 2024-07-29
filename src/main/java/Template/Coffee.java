package Template;

public class Coffee extends Beverages {

    public Coffee(){
        super();
    }
    @Override
    void brew() {
        System.out.println("Stripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Add suger and milk");
    }
}
