package com.company;
import java.util.ArrayList;

public class Shape {
    public ArrayList<Point> Sh;
    public Shape(){
    Sh = new ArrayList<Point>();
}
    public void  addPoint(Point a){
      Sh.add(a);
    }
    public  void getPoints(){
        for(int i = 0;i<Sh.size();i++){
            Point pp = new Point(Sh.get(i).getX(),Sh.get(i).getY());
            System.out.println(pp.getX()+" "+pp.getY());
        }
    }

        public double calculatePerimeter() {
            double perimeter = 0.0;
            if(Sh.size()>=2){
                for(int i = 0; i < Sh.size()-1;i++) {
                    perimeter+=Sh.get(i).getDistance(Sh.get(i+1));
                }
                perimeter += Sh.get(Sh.size()-1).getDistance(Sh.get(0));
            }
            return perimeter;
        }
        public double AverageSide(){
        double p = calculatePerimeter();
        double average = p/(Sh.size());
        return average;
        }
    public double LongestSide() {
        double m = 0.0;
        double first = 0.0;
        if (Sh.size() >= 2) {
            for (int i = 0; i < Sh.size() - 1; i++) {
                first = Sh.get(i).getDistance(Sh.get(i + 1));
                if (first > m) {
                    m = first;
                }
            }
            if(m < Sh.get(Sh.size()-1).getDistance(Sh.get(0))){
                m = Sh.get(Sh.size()-1).getDistance(Sh.get(0));
            }
        }
        return m;
    }
}
    /*private double perimeter;
    private double longestSide;
    private double averageSide;

    Shape(){
        Sh = new ArrayList<Point>();
    }
    /*public void addPoint(Point a){
        Sh.add(a);
    }

    public void getPoints(){
        Point m = new Point ();
        for (Point p : m.getPoints()) {
            System.out.println(p);
        }
    }*/
