package level1.exercise1;

public interface IncomingStep {
    IncomingStep isVegan();
    IncomingStep isGlutenFree();
    MainCourseStep withMainCourse(String name);
}
