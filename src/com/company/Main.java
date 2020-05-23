package com.company;

import com.company.model.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Satellite moon = new Satellite("Moon");
        Satellite phobos = new Satellite("Phobos");
        Satellite deimos = new Satellite("Deimos");

        Planet mercury = new Planet("Mercury");
        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth", List.of(moon));
        Planet mars = new Planet("Mars", List.of(phobos, deimos));
        Planet jupiter = new Planet("Jupiter");
        Planet saturn = new Planet("Saturn");
        Planet uranus = new Planet("Uranus");

        Star sun = new Star("Sun");
        Star randomStar = new Star("RandomStar");

        ArrayList<Planet> solarSystemPlanets = new ArrayList<>(List.of(mercury, venus, earth, mars, jupiter, saturn));

        StarSystem solarSystem = new StarSystem(sun, solarSystemPlanets);
        StarSystem randomSystem = new StarSystem(randomStar, List.of(earth));

        System.out.println("Solar system star name : " + solarSystem.getStarName());


        System.out.println("Count of planets : " + solarSystem.countOfPlanets());

        solarSystem.addPlanet(uranus);

        System.out.println("Count of planets after adding a new planet : " + solarSystem.countOfPlanets());

        System.out.println("Solar system hash code " + solarSystem.hashCode());
        System.out.println("Random system hash code " + randomSystem.hashCode());

        System.out.println("Solar system equals Random system: " + solarSystem.equals(randomSystem));

    }
}
