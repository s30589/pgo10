class RefrigeratedContainer extends Container {
    String productType;
    double requiredTemp;
    double containerTemp;

    @Override
    void load(...) {
        if (containerTemp < requiredTemp) {
            throw new IllegalArgumentException("Za niska temperatura");
        }
    }
}
