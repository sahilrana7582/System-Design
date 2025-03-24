//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sahil sahil = new Sahil();
        Sallu sallu = new Sallu();

        IphoneService iphoneService = new IphoneService();
        iphoneService.addObserver(sahil);
        iphoneService.addObserver(sallu);

        iphoneService.changeStock();
    }
}