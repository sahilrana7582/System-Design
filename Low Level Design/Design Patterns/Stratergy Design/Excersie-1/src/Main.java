//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer simplePc = new Computer("Intel i7", "8GB", "500GB", "Windows 10", "MSI", "Corsair");

        String simplePcMessage = String.format("Simple PC: %s %s %s %s %s %s", simplePc.cpu, simplePc.ram, simplePc.hdd, simplePc.os, simplePc.mothorBoard, simplePc.powerSupply);

        System.out.println(simplePcMessage);


        Computer gamingPc = new Computer("Ryzen9", "16GB", "1TB", "RTX3090","Windows 10", "Asus", "Corsair", "SATA 1TB SSD");

        String gamingPcMessage = String.format("Gaming PC: %s %s %s %s %s %s %s %s", gamingPc.cpu, gamingPc.ram, gamingPc.hdd, gamingPc.gpu, gamingPc.os, gamingPc.mothorBoard, gamingPc.powerSupply, gamingPc.ssd);
        System.out.println(gamingPcMessage);

        /*
        * The Problem is Some of the fields are Optional.
        *
        * Let's Assume Some User Do Not Want Cooling System, Some People Do Not GPU For Each and Every Request We Have to Make So Many Constructor
        *
        * Other things is the order of providing properties
        *
        * If We Accidentally Put the properties in the wrong order it will give us the error.
        *
        * That is why we have to use the Builder Pattern
        *
        * */
    }
}