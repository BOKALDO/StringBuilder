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
        return "Kids escape wilderness."
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
    //tukshums
}

public class Polimorphism {
    public static void main(String[] args){

    }
}
