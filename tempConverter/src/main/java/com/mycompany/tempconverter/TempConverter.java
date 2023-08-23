/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tempconverter;
import java.util.*;
/**
 *
 * @author Albert
 */
public class TempConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature value: ");
        double value = scanner.nextDouble();
        
        temperatureConverter tCon = new temperatureConverter();
        
        double[] convertedTemps = {tCon.celsiusToFahrenheit(value),
                                    tCon.fahrenheitToCelsius(value)};
       
        System.out.println("Celsius to Fahrenheit: " + 
                            convertedTemps[0] +
                            "\nFahrenheit to Celsius: " +
                            convertedTemps[1]);
    }
}
