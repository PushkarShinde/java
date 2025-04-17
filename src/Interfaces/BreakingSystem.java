package Interfaces;

public interface BreakingSystem {
    String breakPads="Disk";
    boolean ABS=true;
    String breakForceDistribution="rear";
    String stoppingDistance="3m";
    float ABS_responseTime=0.6f;

    void ABS();
    void breakPads();
}
