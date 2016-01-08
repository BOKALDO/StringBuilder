package TestJava;

/**
 * Created by Boka on 2016.01.07..
 */
public class PC {

    private PcCase theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(PcCase theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public PcCase getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
