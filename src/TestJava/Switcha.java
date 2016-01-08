package TestJava;

/**
 * Created by Boka on 2015.12.04..
 */
public class Switcha {

    public static void main(String[] args) {
        int value = 3;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value bija 1");
                break;

            case 2:
                System.out.println("Value bija 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Was a 3,or a 4, or a 5");
                System.out.println("Reaalais skaitlis bija " + switchValue);
                break;

            default:
                System.out.println("Was not 1 vai 2");
                break;
        }

        String month = "JAnuary";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}




