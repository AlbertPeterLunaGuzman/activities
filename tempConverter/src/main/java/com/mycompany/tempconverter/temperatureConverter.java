/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tempconverter;

/**
 *
 * @author Albert
 */
public class temperatureConverter extends TempConverter{
    public double celsiusToFahrenheit (double celsius) {
        return (celsius * 9 /5) + 32;
    }
    public double fahrenheitToCelsius (double farenheit){
        return (farenheit - 32)* 5 / 9;
    }
}
