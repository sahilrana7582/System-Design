class Computer {

    public String cpu;
    public String ram;
    public String hdd;
    public String gpu;
    public String os;
    public String mothorBoard;
    public String powerSupply;
    public String ssd;


    //For Gaming and WorkStation Computer
    public Computer(String cpu, String ram, String hdd, String gpu, String os, String mothorBoard, String powerSupply, String ssd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.gpu = gpu;
        this.os = os;
        this.mothorBoard = mothorBoard;
        this.powerSupply = powerSupply;
        this.ssd = ssd;
    }


    //For Simple Computer We Do Not Need GPU
    public Computer(String cpu, String ram, String hdd, String os, String mothorBoard, String powerSupply) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.mothorBoard = mothorBoard;
        this.powerSupply = powerSupply;
    }
}

