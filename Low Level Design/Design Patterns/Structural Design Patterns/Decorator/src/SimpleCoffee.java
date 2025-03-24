public class SimpleCoffee implements Coffee{
    @Override
    public double getPriece() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
