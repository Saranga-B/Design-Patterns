package Factory;

// Base Pizza class
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String[] toppings;

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}

// CheesePizza class
class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings = new String[]{"Fresh Mozzarella", "Parmesan"};
    }
}

// PepperoniPizza class
class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings = new String[]{"Sliced Pepperoni", "Sliced Onion", "Grated parmesan cheese"};
    }
}

// ClamPizza class
class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings = new String[]{"Clams", "Grated parmesan cheese"};
    }
}

// VeggiePizza class
class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings = new String[]{"Shredded mozzarella", "Grated parmesan", "Diced onion", "Sliced mushrooms", "Sliced red pepper", "Sliced black olives"};
    }
}
