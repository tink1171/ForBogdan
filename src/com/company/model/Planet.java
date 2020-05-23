package com.company.model;

import java.util.*;

public class Planet {

    private String name;
    private List<Satellite> satellite;

    public Planet(final String name, final List<Satellite> satellite) {
        this.name = name;
        this.satellite = satellite;
    }

    public Planet(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Satellite> getSatellite() {
        return satellite;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setSatellite(final List<Satellite> satellite) {
        this.satellite = satellite;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", satellite=" + satellite +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Planet planet = (Planet) o;

        if (!Objects.equals(name, planet.name)) return false;
        return Objects.equals(satellite, planet.satellite);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (satellite != null ? satellite.hashCode() : 0);
        return result;
    }
}
