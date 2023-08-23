/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author Albert
 */
abstract class circle extends Shapes {
    private double radius;
    public circle(double radius) { this.radius = radius; }
    double calculateArea() { return Math.PI * this.radius * this.radius; }
}