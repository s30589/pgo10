class Ship {
    String name;
    double maxSpeed;
    int maxContainers;
    double maxWeight;
    List<Container> containers;

    void loadContainer(Container c) throws Exception { ... }

    void unloadContainer(String serial) { ... }

    void replaceContainer(String serial, Container newC) { ... }

    void transferContainer(Ship toShip, String serial) { ... }
}

