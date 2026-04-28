package level1.exercise1;

public class RestaurantMain {
    public static void main(String[] args) {
        Menu executiveMenu = new MenuBuilder()
                .withIncoming("Amanida Mediterranea")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vadella")
                .withSupplement("Guarnicio Extra")
                .withDessert("Mousse de Xocolata")
                .withDrink("Vi Negre")
                .build();

        System.out.println(executiveMenu);

        Menu kidsMenu = new MenuBuilder()
                .withMainCourse("Macarrons amb Tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de Taronja")
                .build();

        System.out.println(kidsMenu);

        Menu halfMenu = new MenuBuilder()
                .withMainCourse("Rissoto de Bolets")
                .isVegan()
                .withCoffee("Espresso")
                .withDrink("Aigua")
                .build();

        System.out.println(halfMenu);
    }
}
