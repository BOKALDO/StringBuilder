package TestJava;

/**
 * Created by Boka on 2016.01.09..
 */

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public  Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Visi ir Dead";
    }
}

class AlienDay extends Movie{
    public AlienDay(){
        super("Alien Day");
    }

    @Override
    public String plot() {
        return "Aliens take you over";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids escape wilderness.";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Joda with tricks";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
    //Briiva vieta te
}

public class Polimorphism {
    public static void main(String[] args){

        for(int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + " : " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random numbers was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new AlienDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
