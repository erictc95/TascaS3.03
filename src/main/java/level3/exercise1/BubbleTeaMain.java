package level3.exercise1;

import java.text.DecimalFormat;

public class BubbleTeaMain {
    public static void main(String[] args) {

        BubbleTea tea = new LatteBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Flavor(tea, "Maduixa");
        tea = new Flavor(tea, "Mango");

        System.out.println(tea.getDescription());
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(tea.getCost()) + "€");
    }
}
