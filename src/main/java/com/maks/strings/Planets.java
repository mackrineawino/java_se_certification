package com.maks.strings;

public class Planets {
    public String name;
    public int moons;

    public Planets(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public static void main(String[] args) {
        Planets[] planets = { new Planets("Mercury", 0),
                new Planets("Venus", 0),
                new Planets("Earth", 1),
                new Planets("Mars", 2),
        };
        System.out.println(planets);
        System.out.println(planets[2]);
        System.out.println(planets[2].moons);
    }
}
