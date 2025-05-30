class GasContainer extends Container implements IHazardNotifier {
    double pressure;

    @Override
    void unload() {
        currentLoad *= 0.05;
    }

    @Override
    public void notifyDanger(String msg) {
        System.out.println("ZAGROŻENIE GAZOWE: " + msg);
    }
}
