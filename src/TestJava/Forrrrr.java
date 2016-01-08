package TestJava;

/**
 * Created by Boka on 2015.12.07..
 */
public class Forrrrr {
    public static void main(String[] args) {

        System.out.println("10,000 at 2% intrest = " + calculateIntrest(10000.0,2.0));
        System.out.println("10,000 at 3% intrest = " + calculateIntrest(10000.0,3.0));
        System.out.println("10,000 at 4% intrest = " + calculateIntrest(10000.0,4.0));

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " #YOLO");
        }
//Iet uz aukshu
        for(int i=2; i<9;i++){
            System.out.println("10,000 at " + i + "% intrest = " + calculateIntrest(10000,i));
        }
//Iet uz leju
        for(int i=8; i>=2;i--) {
            System.out.println("10,000 at " + i + "% intrest = " + calculateIntrest(10000, i));
        }
    }

    public static  double calculateIntrest(double amout,double intrestRate){
        return (amout * (intrestRate/100.0));
    }
}
