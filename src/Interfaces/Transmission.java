package Interfaces;

public interface Transmission {
    String gearbox="manual";
    boolean clutch=true; boolean torqueConverter=false;
    boolean synchronizers=true;
    int gears=8;
    String transmission="manual";
    String driveTrain="AWT";

    void gearBox();
    int gears();
}
