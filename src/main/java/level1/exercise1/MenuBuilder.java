package level1.exercise1;

public class MenuBuilder implements StartStep, IncomingStep, MainCourseStep, FinalStep {

    private Menu menu;
    private Dish currentDish;

    public MenuBuilder() {
        this.menu = new Menu();
    }

    @Override
    public MenuBuilder isVegan() {
        currentDish.setVegan(true);
        return this;
    }

    @Override
    public MenuBuilder isGlutenFree() {
        currentDish.setGlutenFree(true);
        return this;
    }

    @Override
    public MainCourseStep withSupplement(String supplement) {
        currentDish.setSupplement(supplement);
        return this;
    }

    @Override
    public FinalStep withDessert(String dessert) {
        menu.setDessert(dessert);
        return this;
    }

    @Override
    public FinalStep withCoffee(String coffee) {
        menu.setCoffee(coffee);
        return this;
    }

    @Override
    public FinalStep withDrink(String drink) {
        menu.setDrink(drink);
        return this;
    }

    @Override
    public Menu build() {
        return menu;
    }

    @Override
    public IncomingStep withIncoming(String name) {
        Dish incoming = new Dish(name);
        menu.setIncoming(incoming);
        currentDish = incoming;
        return this;
    }

    @Override
    public MainCourseStep withMainCourse(String name) {
        Dish mainCourse = new Dish(name);
        menu.setMainCourse(mainCourse);
        currentDish = mainCourse;
        return this;
    }
}
