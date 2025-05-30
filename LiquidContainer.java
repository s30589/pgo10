class LiquidContainer extends Container implements IHazardNotifier {
    boolean isHazardous;

    @Override
    void load(double mass) throws OverfillException {
        if (isHazardous && mass > maxLoad * 0.5) {
            notifyDanger("Próba przeładowania niebezpiecznego ładunku: " + serialNumber);
            throw new OverfillException("Niebezpieczne przeładowanie.");
        } else if (mass > maxLoad * 0.9) {
            throw new OverfillException("Za dużo masy.");
        }
        ...
    }

    @Override
    public void notifyDanger(String msg) {
        System.out.println("ALERT: " + msg);
    }
}
