public class FrenchCoffee extends CoffeeDecorator{
    public FrenchCoffee(Coffee coffee) {
        super(coffee);
    }



    @Override
    public double getPriece() {
        return super.getPriece() + 7.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " +  with French Flavour";
    }
}
