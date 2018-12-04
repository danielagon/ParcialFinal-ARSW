/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcialfinal.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author 2109734
 */
@Service
public class ConvertidorTemperatura {
    
    private double grados;
    private String tipo;
    private double temperatura = -1;
    
    public ConvertidorTemperatura(){
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(float grados) {
        this.grados = grados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getConversionTemperatura(double grados, String tipo){
        this.grados = grados;
        this.tipo = tipo;
        double cons = 1.8;
        if (tipo.equals("C")){
            //Convierte los grados Fahrenheit a grados Celsius
            temperatura = (grados - 32)/cons;
        }else {
            //Convierte los grados celsius a grados Fahrenheit
            temperatura = ((grados * cons) + 32);
        }
        return temperatura;
    }
}
