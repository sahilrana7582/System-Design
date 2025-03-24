//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimpleCoffee simpleCoffee = new SimpleCoffee();

        Coffee milkCoffee = new MilkDecoratedCoffee(simpleCoffee);


        Coffee frenchCoffee = new FrenchCoffee(milkCoffee);

        String simpleCoffeeMsg = String.format("Price: %s, Description: %s", simpleCoffee.getPriece(), simpleCoffee.getDescription());
        String milkCoffeeMsg = String.format("Price: %s, Description: %s", milkCoffee.getPriece(), milkCoffee.getDescription());
        String frenchCoffeeMsg = String.format("Price: %s, Description: %s", frenchCoffee.getPriece(), frenchCoffee.getDescription());


        System.out.println(simpleCoffeeMsg);
        System.out.println(milkCoffeeMsg);
        System.out.println(frenchCoffeeMsg);


    }
}