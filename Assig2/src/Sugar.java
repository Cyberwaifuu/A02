public class Sugar extends CondimentDecorator{

    public Sugar(Coffee coffee) {
        super(coffee);
        description = coffee.getDescription();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Sugar ";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.3;
    }
}