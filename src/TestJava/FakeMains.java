package TestJava;

/**
 * Created by Boka on 2015.12.11..
 */
public class FakeMains {
    public static void main(String[] args){

        Car bmw = new Car();
        Car nissan = new Car();
        bmw.setModel("911");
        System.out.println("Model is " + bmw.getModel());
    }
}
