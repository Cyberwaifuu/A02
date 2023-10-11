public abstract class CondimentDecorator extends Coffee{
    protected Coffee coffee;

    public CondimentDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public abstract double cost();
}
