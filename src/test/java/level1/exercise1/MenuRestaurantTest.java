package level1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenuRestaurantTest {

    @Test
    void shouldBuildExecutiveMenuCorrectly() {
        Menu executiveMenu = new MenuBuilder()
                .withIncoming("Amanida Mediterranea")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vadella")
                .withSupplement("Guarnicio Extra")
                .withDessert("Mousse de Xocolata")
                .withDrink("Vi Negre")
                .build();

        assertEquals("Amanida Mediterranea", executiveMenu.getIncoming().getName());
        assertTrue(executiveMenu.getIncoming().isVegan());
        assertTrue(executiveMenu.getIncoming().isGlutenFree());

        assertEquals("Filet de Vadella", executiveMenu.getMainCourse().getName());
        assertEquals("Guarnicio Extra", executiveMenu.getMainCourse().getSupplement());

        assertEquals("Mousse de Xocolata", executiveMenu.getDessert());
        assertEquals("Vi Negre", executiveMenu.getDrink());

        assertNull(executiveMenu.getCoffee());
    }

    @Test
    void shouldBuildKidsMenuCorrectly() {

        Menu kidsMenu = new MenuBuilder()
                .withMainCourse("Macarrons amb Tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de Taronja")
                .build();

        assertNull(kidsMenu.getIncoming());

        assertEquals("Macarrons amb Tomàquet", kidsMenu.getMainCourse().getName());
        assertEquals("Gelat de Vainilla", kidsMenu.getDessert());
        assertEquals("Suc de Taronja", kidsMenu.getDrink());

        assertNull(kidsMenu.getCoffee());
    }

    @Test
    void shouldBuildHalfMenuCorrectly() {

        Menu halfMenu = new MenuBuilder()
                .withMainCourse("Rissoto de Bolets")
                .isVegan()
                .withCoffee("Espresso")
                .withDrink("Aigua")
                .build();

        assertNull(halfMenu.getIncoming());

        assertEquals("Rissoto de Bolets", halfMenu.getMainCourse().getName());
        assertTrue(halfMenu.getMainCourse().isVegan());

        assertEquals("Espresso", halfMenu.getCoffee());
        assertEquals("Aigua", halfMenu.getDrink());

        assertNull(halfMenu.getDessert());

    }
}
