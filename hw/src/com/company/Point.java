package com.company;
import java.util.Scanner;
import java.io.File;
public class Point {
    private double x;
    private double y;

    public Point(){ }
    public Point(double a, double b) {
      this.x = a;
      this.y = b;
    }
        public double getDistance(Point a) {
            double x1 = a.x;
            double y1 = a.y;
            double distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
            return distance;
        }
    public void setX(double a) {
        x = a;
    }

    public void setY(double a) {
        y = a;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}


