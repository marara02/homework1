package com.company;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;
import java.io.File;

public class AssignmentOne {

    public static void main(String[] args) throws FileAlreadyExistsException, FileNotFoundException {
        // write your code here
        Shape s = new Shape();
        Scanner file = new Scanner(new File("C:\\Users\\ww\\IdeaProjects\\hw\\src\\com\\company\\data1.txt"));
        //Scanner file 2 = new Scanner(new File("C:\\Users\\ww\\IdeaProjects\\hw\\src\\com\\company\\file2.txt"));
        while (file.hasNextDouble()) {
            double x = file.nextDouble();
            double y = file.nextDouble();
            Point a = new Point(x, y);
            s.addPoint(a);
            //s.addPoint();

        }
        System.out.println(s.calculatePerimeter());
        System.out.println(s.LongestSide());
        System.out.println(s.AverageSide());
        //s.getPoints();

    }
}
