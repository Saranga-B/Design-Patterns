package Template;

public class TemplatePattern {
    static Beverages beverages = null;
    public static void main(String[] args) {
        Beverages tea = new Tea();
        tea.prepareWithRecipie();

        Beverages coffee = new Coffee();
        coffee.prepareWithRecipie();
    }
}
