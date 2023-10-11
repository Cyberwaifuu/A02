public class NutSyrup extends CondimentDecorator{
    public NutSyrup(Coffee coffee) {
        super(coffee);
        description = coffee.getDescription();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Nut Syrup ";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
