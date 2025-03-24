public class CoffeeDecorator implements Coffee{

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public  double getPriece(){
        return coffee.getPriece();
    };

    @Override
    public String getDescription(){
        return coffee.getDescription();
    };
}
