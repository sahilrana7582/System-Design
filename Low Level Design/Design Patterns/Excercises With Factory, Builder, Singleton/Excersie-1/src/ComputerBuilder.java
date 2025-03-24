class ComputerBuilder {
    private String processor;
    private int cores;
    private int threads;
    private double baseClock;
    private double boostClock;
    private String architecture;

    private String motherboard;
    private String chipset;
    private int ramSlots;
    private boolean supportsOverclocking;

    private String ramType;
    private int ramSize;
    private int ramSpeed;
    private int ramChannels;
    private boolean hasECC;

    private String gpu;
    private int vram;
    private String gpuArchitecture;
    private int cudaCores;
    private int tensorCores;

    private String storageType1;
    private int storageSize1;
    private String storageType2;
    private int storageSize2;
    private boolean hasRAIDSupport;

    private String psu;
    private int psuWattage;
    private String psuEfficiencyRating;

    private String caseType;
    private int fanCount;
    private boolean hasRGB;
    private boolean supportsLiquidCooling;

    private String os;
    private boolean isPreBuilt;


    private String networkCard;
    private String wifiStandard;
    private boolean hasBluetooth;

    private String soundCard;
    private int audioChannels;

    private String usbPorts;
    private int thunderboltPorts;
    private boolean hasHDMI;
    private boolean hasDisplayPort;

    private String coolingSolution;
    private boolean hasCustomWaterLoop;

    private String opticalDrive;
    private boolean hasCardReader;

    private boolean hasRGBLighting;
    private boolean hasSidePanelWindow;

    private String keyboardType;
    private boolean isMechanical;

    private String mouseType;
    private int dpi;

    private String monitorModel;
    private int screenSize;
    private int refreshRate;
    private boolean isCurved;

    private String warrantyPeriod;
    private boolean hasExtendedWarranty;

    private double totalPrice;

    private ComputerBuilder(Builder builder) {
        this.processor = builder.processor;
        this.cores = builder.cores;
        this.threads = builder.threads;
        this.baseClock = builder.baseClock;
        this.boostClock = builder.boostClock;
        this.architecture = builder.architecture;
        this.motherboard = builder.motherboard;
        this.chipset = builder.chipset;
        this.ramSlots = builder.ramSlots;
        this.supportsOverclocking = builder.supportsOverclocking;
        this.ramType = builder.ramType;
        this.ramSize = builder.ramSize;
        this.ramSpeed = builder.ramSpeed;
        this.ramChannels = builder.ramChannels;
        this.hasECC = builder.hasECC;
        this.gpu = builder.gpu;
        this.vram = builder.vram;
        this.gpuArchitecture = builder.gpuArchitecture;
        this.cudaCores = builder.cudaCores;
        this.tensorCores = builder.tensorCores;

        this.hasRAIDSupport = builder.hasRAIDSupport;
        this.psu = builder.psu;
        this.psuWattage = builder.psuWattage;
        this.psuEfficiencyRating = builder.psuEfficiencyRating;
        this.caseType = builder.caseType;
        this.fanCount = builder.fanCount;
        this.hasRGB = builder.hasRGB;
        this.supportsLiquidCooling = builder.supportsLiquidCooling;
        this.os = builder.os;
        this.isPreBuilt = builder.isPreBuilt;
        this.networkCard = builder.networkCard;
        this.wifiStandard = builder.wifiStandard;
        this.hasBluetooth = builder.hasBluetooth;
        this.soundCard = builder.soundCard;
        this.audioChannels = builder.audioChannels;
        this.usbPorts = builder.usbPorts;
        this.thunderboltPorts = builder.thunderboltPorts;
        this.hasHDMI = builder.hasHDMI;
        this.hasDisplayPort = builder.hasDisplayPort;
        this.coolingSolution = builder.coolingSolution;
        this.hasCustomWaterLoop = builder.hasCustomWaterLoop;
        this.opticalDrive = builder.opticalDrive;
        this.hasCardReader = builder.hasCardReader;
        this.hasRGBLighting = builder.hasRGBLighting;
        this.hasSidePanelWindow = builder.hasSidePanelWindow;
        this.keyboardType = builder.keyboardType;
        this.isMechanical = builder.isMechanical;
        this.mouseType = builder.mouseType;
        this.dpi = builder.dpi;
        this.monitorModel = builder.monitorModel;
        this.screenSize = builder.screenSize;
        this.refreshRate = builder.refreshRate;
        this.isCurved = builder.isCurved;
        this.warrantyPeriod = builder.warrantyPeriod;
        this.hasExtendedWarranty = builder.hasExtendedWarranty;
        this.totalPrice = builder.totalPrice;
    }


    public static class Builder{
        private String processor;
        private int cores;
        private int threads;
        private int baseClock;
        private int boostClock;
        private String architecture;
        private String motherboard;
        private String chipset;
        private int ramSlots;
        private boolean supportsOverclocking;
        private String ramType;
        private int ramSize;
        private int ramSpeed;
        private int ramChannels;
        private boolean hasECC;
        private String gpu;
        private int vram;
        private String gpuArchitecture;
        private int cudaCores;
        private int tensorCores;
        private String storageType1;
        private int storageSize1;
        private String storageType2;
        private int storageSize2;
        private boolean hasRAIDSupport;
        private String psu;
        private int psuWattage;
        private String psuEfficiencyRating;
        private String caseType;
        private int fanCount;
        private boolean hasRGB;
        private boolean supportsLiquidCooling;
        private String os;
        private boolean isPreBuilt;
        private String networkCard;
        private String wifiStandard;
        private boolean hasBluetooth;
        private String soundCard;
        private int audioChannels;
        private String usbPorts;
        private int thunderboltPorts;
        private boolean hasHDMI;
        private boolean hasDisplayPort;
        private String coolingSolution;
        private boolean hasCustomWaterLoop;
        private String opticalDrive;
        private boolean hasCardReader;
        private boolean hasRGBLighting;
        private boolean hasSidePanelWindow;
        private String keyboardType;
        private boolean isMechanical;
        private String mouseType;
        private int dpi;
        private String monitorModel;
        private int screenSize;
        private int refreshRate;
        private boolean isCurved;
        private String warrantyPeriod;
        private boolean hasExtendedWarranty;
        private int totalPrice;

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }
        public Builder setCores(int cores) {
            this.cores = cores;
            return this;
        }
        public Builder setThreads(int threads) {
            this.threads = threads;
            return this;
        }
        public Builder setBaseClock(int baseClock) {
            this.baseClock = baseClock;
            return this;
        }
        public Builder setBoostClock(int boostClock) {
            this.boostClock = boostClock;
            return this;
        }
        public Builder setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }
        public Builder setChipset(String chipset) {
            this.chipset = chipset;
            return this;
        }
        public Builder setRamSlots(int ramSlots) {
            this.ramSlots = ramSlots;
            return this;
        }
        public Builder setSupportsOverclocking(boolean supportsOverclocking) {
            this.supportsOverclocking = supportsOverclocking;
            return this;
        }
        public Builder setRamType(String ramType) {
            this.ramType = ramType;
            return this;
        }
        public Builder setRamSize(int ramSize) {
            this.ramSize = ramSize;
            return this;
        }
        public Builder setRamSpeed(int ramSpeed) {
            this.ramSpeed = ramSpeed;
            return this;
        }
        public Builder setRamChannels(int ramChannels) {
            this.ramChannels = ramChannels;
            return this;
        }
        public Builder setHasECC(boolean hasECC) {
            this.hasECC = hasECC;
            return this;
        }
        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder setVram(int vram) {
            this.vram = vram;
            return this;
        }
        public Builder setGpuArchitecture(String gpuArchitecture) {
            this.gpuArchitecture = gpuArchitecture;
            return this;
        }
        public Builder setCudaCores(int cudaCores) {
            this.cudaCores = cudaCores;
            return this;
        }
        public Builder setTensorCores(int tensorCores) {
            this.tensorCores = tensorCores;
            return this;
        }
        public Builder setStorageType1(String storageType1) {
            this.storageType1 = storageType1;
            return this;
        }
        public Builder setStorageSize1(int storageSize1) {
            this.storageSize1 = storageSize1;
            return this;
        }
        public Builder setStorageType2(String storageType2) {
            this.storageType2 = storageType2;
            return this;
        }
        public Builder setStorageSize2(int storageSize2) {
            this.storageSize2 = storageSize2;
            return this;
        }
        public Builder setHasRAIDSupport(boolean hasRAIDSupport) {
            this.hasRAIDSupport = hasRAIDSupport;
            return this;
        }
        public Builder setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }
        public Builder setFanCount(int fanCount) {
            this.fanCount = fanCount;
            return this;
        }
        public Builder setHasRGB(boolean hasRGB) {
            this.hasRGB = hasRGB;
            return this;
        }
        public Builder setSupportsLiquidCooling(boolean supportsLiquidCooling) {
            this.supportsLiquidCooling = supportsLiquidCooling;
            return this;
        }
        public Builder setOs(String os) {
            this.os = os;
            return this;
        }
        public Builder setIsPreBuilt(boolean isPreBuilt) {
            this.isPreBuilt = isPreBuilt;
            return this;
        }
        public Builder setNetworkCard(String networkCard) {
            this.networkCard = networkCard;
            return this;
        }
        public Builder setWifiStandard(String wifiStandard) {
            this.wifiStandard = wifiStandard;
            return this;
        }
        public Builder setHasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }
        public Builder setSoundCard(String soundCard) {
            this.soundCard = soundCard;
            return this;
        }
        public Builder setAudioChannels(int audioChannels) {
            this.audioChannels = audioChannels;
            return this;
        }
        public Builder setUsbPorts(String usbPorts) {
            this.usbPorts = usbPorts;
            return this;
        }
        public Builder setThunderboltPorts(int thunderboltPorts) {
            this.thunderboltPorts = thunderboltPorts;
            return this;
        }
        public Builder setHasHDMI(boolean hasHDMI) {
            this.hasHDMI = hasHDMI;
            return this;
        }
        public Builder setHasDisplayPort(boolean hasDisplayPort) {
            this.hasDisplayPort = hasDisplayPort;
            return this;
        }
        public Builder setCoolingSolution(String coolingSolution) {
            this.coolingSolution = coolingSolution;
            return this;
        }
        public Builder setHasCustomWaterLoop(boolean hasCustomWaterLoop) {
            this.hasCustomWaterLoop = hasCustomWaterLoop;
            return this;
        }
        public Builder setOpticalDrive(String opticalDrive) {
            this.opticalDrive = opticalDrive;
            return this;
        }
        public Builder setHasCardReader(boolean hasCardReader) {
            this.hasCardReader = hasCardReader;
            return this;
        }
        public Builder setHasRGBLighting(boolean hasRGBLighting) {
            this.hasRGBLighting = hasRGBLighting;
            return this;
        }
        public Builder setHasSidePanelWindow(boolean hasSidePanelWindow) {
            this.hasSidePanelWindow = hasSidePanelWindow;
            return this;
        }
        public Builder setKeyboardType(String keyboardType) {
            this.keyboardType = keyboardType;
            return this;
        }
        public Builder setIsMechanical(boolean isMechanical) {
            this.isMechanical = isMechanical;
            return this;
        }
        public Builder setMouseType(String mouseType) {
            this.mouseType = mouseType;
            return this;
        }
        public Builder setDpi(int dpi) {
            this.dpi = dpi;
            return this;
        }
        public Builder setMonitorModel(String monitorModel) {
            this.monitorModel = monitorModel;
            return this;
        }
        public Builder setIsCurved(boolean isCurved) {
            this.isCurved = isCurved;
            return this;
        }
        public Builder setWarrantyPeriod(String warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
            return this;
        }
        public Builder setHasExtendedWarranty(boolean hasExtendedWarranty) {
            this.hasExtendedWarranty = hasExtendedWarranty;
            return this;
        }
        public Builder setTotalPrice(int totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public ComputerBuilder build(){
            return new ComputerBuilder(this);
        }
    }

}
