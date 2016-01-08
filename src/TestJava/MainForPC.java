package TestJava;

/**
 * Created by Boka on 2016.01.07..
 */
public class MainForPC {
    public static void main(String[] args){

        Dimensions dimensions = new Dimensions(20,20,5);
        PcCase theCase = new PcCase("220B","Dell","240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v13.37");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,  1200, "red" );
        thePC.getMotherboard().loadProgram("Windows XP");
        thePC.getTheCase().pressPowerButton();

    }
}
