package level1.exercise1;

public interface IncomingStep {
    IncomingStep isVegan();
    IncomingStep isGlutenFree();
    MainCourse withMainCourse(String name);
}
