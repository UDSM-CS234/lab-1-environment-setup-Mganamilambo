package com.company;

public class Main {

    public static void main(String[] args) {
        double a = -9.81; // Earth's gravity in m/s^2
        double vi = 0.0; // initial velocity
        double t = 10.0; // falling time
        double xi = 0.0; // initial position
        double xt;
        xt = (0.5*a*(t*t)) + vi*t+ xi;
        System.out.println("The object's position after " + t +
                " seconds is " + xt + " m.");
    }
}
