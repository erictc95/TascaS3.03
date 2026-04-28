package level1.exercise1;

public class Menu {

    private Dish incoming;
    private Dish mainCourse;
    private String dessert;
    private String coffee;
    private String drink;

    public Dish getIncoming() {
        return incoming;
    }

    public void setIncoming(Dish incoming) {
        this.incoming = incoming;
    }

    public Dish getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(Dish mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        String result = "Menu:\n";

        if (incoming != null) {
            result += " - Incoming: " + incoming + "\n";
        }

        if (mainCourse != null) {
            result += " - Main Course: " + mainCourse + "\n";
        }

        if (dessert != null) {
            result += " - Dessert: " + dessert + "\n";
        }

        if (coffee != null) {
            result += " - Coffee: " + coffee + "\n";
        }

        if (drink != null) {
            result += " - Drink: " + drink + "\n";
        }

        return result;
    }
}
