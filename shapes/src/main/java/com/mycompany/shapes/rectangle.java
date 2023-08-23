/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapes;

/**
 *
 * @author Albert
 */
abstract class rectangle {
    private double width;   private double height;
    public rectangle(double width, double height) { this.width = width; this.height = height; }
    double calculateArea() { return width * height; }
}
