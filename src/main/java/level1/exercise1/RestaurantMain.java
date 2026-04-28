package level1.exercise1;

public class RestaurantMain {
    public static void main(String[] args) {
        Menu executiveMenu = new MenuBuilder()
                .withIncoming("Amanida Mediterranea")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vadella")
                .withSupplement("Guarnicio extra")
                .withDessert("Mouse de Xocolata")
                .withDrink("Vi Negre")
                .build();

        System.out.println(executiveMenu);
    }
}
