package level3.exercise1;

public class Sugar extends BubbleTeaDecorator{

    public Sugar(BubbleTea bubbleTea) {
        super(bubbleTea);
    }

    @Override
    public String getDescription() {
        return bubbleTea.getDescription() + " + Sugar";
    }

    @Override
    public double getCost() {
        return bubbleTea.getCost() + 0.30;
    }
}
