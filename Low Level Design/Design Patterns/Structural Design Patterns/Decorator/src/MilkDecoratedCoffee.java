public class MilkDecoratedCoffee extends CoffeeDecorator{

    MilkDecoratedCoffee(Coffee coffee){
        super(coffee);
    }

    @Override
    public double getPriece() {
        return super.getPriece() + 2.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + with Milk";
    }

}
