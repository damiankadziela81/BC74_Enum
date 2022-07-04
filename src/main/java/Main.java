enum Planet {
    MERCURY(1,0),
    VENUS(2,0),
    EARTH(3,1),
    MARS(4,2),
    JUPITER(5,79),
    SATURN(6,82),
    URANUS(7,27),
    NEPTUNE(8,14),
    PLUTO(9,5);

    int number,moons;

    Planet(int number,int moons) {
        this.number = number;
        this.moons = moons;
    }
}

public class Main {
    public static void main(String[] args){

        //enum = enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects

        Planet myPlanet = Planet.MARS;

        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here.");
                System.out.println("This is planet # " + myPlanet.number + " and it has " + myPlanet.moons + " moon(s).");
                break;
            default:
                System.out.println("You can't live here.");
                System.out.println("This is planet # " + myPlanet.number + " and it has " + myPlanet.moons + " moon(s).");
                break;
        }
    }
}
