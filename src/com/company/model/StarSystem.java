package com.company.model;

import java.util.*;

public class StarSystem {

    private List<Planet> planets;
    private Star star;

    public StarSystem(final Star star, final List<Planet> planets) {
        this.planets = planets;
        this.star = star;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(final List<Planet> planets) {
        this.planets = planets;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(final Star star) {
        this.star = star;
    }

    public int countOfPlanets() {
        return planets.size();
    }

    public String getStarName() {
        return this.star.getName();
    }

    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }

    @Override
    public String toString() {
        return "StarSystem{" +
                "planets=" + planets +
                ", star=" + star +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final StarSystem that = (StarSystem) o;

        if (!Objects.equals(planets, that.planets)) return false;
        return Objects.equals(star, that.star);
    }

    @Override
    public int hashCode() {
        int result = planets != null ? planets.hashCode() : 0;
        result = 31 * result + (star != null ? star.hashCode() : 0);
        return result;
    }

}
