package TestJava;

/**
 * Created by Boka on 2015.12.11..
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){

        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("kamaz")) {
            this.model = model;
        } else {
            this.model = "Hz";
        }

    }
    public String getModel() {
        return this.model;
    }
}
