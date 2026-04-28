package level1.exercise1;

public class MenuBuilder implements StartStep {

    private Menu menu;
    private Dish currentDish;

    public MenuBuilder() {
        this.menu = new Menu();
    }

    @Override
    public IncomingStep withIncoming(String name) {
        Dish incoming = new Dish(name);
        menu.setIncoming(incoming);
        currentDish = incoming;
        return new IncomingBuilder();
    }

    @Override
    public MainCourseStep withMainCourse(String name) {
        Dish mainCourse = new Dish(name);
        menu.setMainCourse(mainCourse);
        currentDish = mainCourse;
        return new MainCourseBuilder();
    }

    private class IncomingBuilder implements IncomingStep {

        @Override
        public IncomingStep isVegan() {
            currentDish.setVegan(true);
            return this;
        }

        @Override
        public IncomingStep isGlutenFree() {
            currentDish.setGlutenFree(true);
            return this;
        }

         @Override
        public MainCourseStep withMainCourse(String name) {
            Dish mainCourse = new Dish(name);
            menu.setMainCourse(mainCourse);
            currentDish = mainCourse;
            return new MainCourseBuilder();
         }
    }

    private class MainCourseBuilder implements MainCourseStep {

        @Override
        public MainCourseStep isVegan() {
            currentDish.setVegan(true);
            return this;
        }

        @Override
        public MainCourseStep isGlutenFree() {
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
            return new FinalBuilder();
        }

        @Override
        public FinalStep withCoffee(String coffee) {
            menu.setCoffee(coffee);
            return new FinalBuilder();
        }

        @Override
        public FinalStep withDrink(String drink) {
            menu.setDrink(drink);
            return new FinalBuilder();
        }

        @Override
        public Menu build() {
            return menu;
        }
    }

    private class FinalBuilder implements FinalStep {

        @Override
        public FinalStep withDrink(String drink) {
            menu.setDrink(drink);
            return this;
        }

        @Override
        public Menu build() {
            return menu;
        }
    }


}
