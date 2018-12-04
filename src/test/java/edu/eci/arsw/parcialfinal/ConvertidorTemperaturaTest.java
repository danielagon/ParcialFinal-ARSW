/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcialfinal;

import edu.eci.arsw.parcialfinal.services.ConvertidorTemperatura;
import org.junit.Test;

/**
 *
 * @author 2109734
 */
public class ConvertidorTemperaturaTest {
    
    private ConvertidorTemperatura convertidor = new ConvertidorTemperatura();
    
    @Test
    public void convertirCelsiusaFahrenheit(){
        double resultado = convertidor.getConversionTemperatura(10, "F");
        double resultadoEsperado = 50;
        org.junit.Assert.assertEquals(resultado, resultadoEsperado, 0);
    }
    
    @Test
    public void convertirFahrenheitaCelsius(){
        double resultado = convertidor.getConversionTemperatura(50, "C");
        double resultadoEsperado = 10;
        org.junit.Assert.assertEquals(resultado, resultadoEsperado, 0);
    }
}
