/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcialfinal;

import edu.eci.arsw.parcialfinal.services.ConvertidorTemperatura;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author 2109734
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationServicesTest {
    
    @Autowired
    private ConvertidorTemperatura convertidor;
    
    @Test
    public void contextLoads(){        
        
    }
    
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
