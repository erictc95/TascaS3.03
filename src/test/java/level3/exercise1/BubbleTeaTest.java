package level3.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleTeaTest {

    @Test
    void shouldCreateLatteBaseBubbleTea() {
        BubbleTea tea = new LatteBase();

        assertEquals("Latte Bubble Tea", tea.getDescription());
        assertEquals(3.50, tea.getCost(), 0.01);
    }

    @Test
    void shouldAddIceToMatchaBubbleTea() {
        BubbleTea tea = new MatchaBase();
        tea = new Ice(tea);

        assertEquals("Matcha Bubble Tea + Ice", tea.getDescription());
        assertEquals(3.45, tea.getCost(), 0.01);
    }

    @Test
    void shouldAddTapiocaAndSugarToTeaBubbleTea() {
        BubbleTea tea = new TeaBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);

        assertEquals("Tea Bubble Tea + Tapioca + Sugar", tea.getDescription());
        assertEquals(3.80, tea.getCost(), 0.01);
    }

    @Test
    void shouldAddTwoFlavorsToLatteBubbleTea() {
        BubbleTea tea = new LatteBase();
        tea = new Flavor(tea,"Maduixa");
        tea = new Flavor(tea, "Mango");

        assertEquals("Latte Bubble Tea + Flavor: Maduixa + Flavor: Mango", tea.getDescription());
        assertEquals(4.70, tea.getCost(), 0.01);
    }

    @Test
    void shouldCreateFullyCustomizedBubbleTea() {
        BubbleTea tea = new LatteBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Maduixa");
        tea = new Flavor(tea, "Mango");

        assertEquals("Latte Bubble Tea + Tapioca + Sugar + Flavor: Maduixa + Flavor: Mango", tea.getDescription());
        assertEquals(5.50, tea.getCost(), 0.01);
    }

}
