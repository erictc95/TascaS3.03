package level1.exercise1;

public interface MainCourseStep {
    MainCourseStep isVegan();
    MainCourseStep isGlutenFree();
    MainCourseStep withSupplement(String supplement);

    FinalStep withDessert(String dessert);
    FinalStep withCoffee(String coffee);
    FinalStep withDrink(String drink);
    Menu build();
}
