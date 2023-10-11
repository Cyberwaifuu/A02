public class CaramelSyrup extends CondimentDecorator {
    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5;
    }
}