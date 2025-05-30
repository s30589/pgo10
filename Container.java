abstract class Container {
    String serialNumber;
    double height;
    double depth;
    double tareWeight;
    double maxLoad;
    double currentLoad;

    static int idCounter = 1;

    public Container(...) {
        this.serialNumber = generateSerialNumber();
    }

    abstract String generateSerialNumber();

    void load(double mass) throws OverfillException { ... }

    void unload() { ... }
}
