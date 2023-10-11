public class AlmondMilk extends CondimentDecorator{

    public AlmondMilk(Coffee coffee) {
        super(coffee);
        description = coffee.getDescription();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "AlmondMilk ";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.3;
    }
}