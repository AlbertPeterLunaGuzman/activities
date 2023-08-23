/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapes;
import java.util.*;
/**
 *
 * @author Albert
 */
abstract class shape { abstract double calculateArea(); }

public class Shapes {

    public static void main(String[] args) {
        myCircle();
    }
    
    private static double circleContent () {
        Scanner circleScanner = new Scanner (System.in);
        System.out.print("Enter the Area value of circle: ");
        double aC = circleScanner.nextDouble(); return aC;
    } 
    
    private static void myCircle() {
        circle circle = new circle(circleContent()) {};
  
        double circleArea = circle.calculateArea();
     
        System.out.println("Circle Area: " + circleArea);
    
    }
    
    private static void myRectangle() {
    
        Scanner rectangleScanner = new Scanner (System.in);
        
        System.out.print("Enter the width for rectangle: ");
        double width = rectangleScanner.nextDouble();
        
        System.out.print("Enter the height for rectangle: ");
        double height = rectangleScanner.nextDouble();
        
        
        rectangle rectangle = new rectangle(width,  height) {};

        double rectangleArea = rectangle.calculateArea();

        System.out.println("Rectangle Area: " + rectangleArea);
    
    }
}
