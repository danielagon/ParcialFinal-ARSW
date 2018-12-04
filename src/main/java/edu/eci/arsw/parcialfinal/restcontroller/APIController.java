/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcialfinal.restcontroller;

import edu.eci.arsw.parcialfinal.services.ConvertidorTemperatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2109734
 */
@Service
@RestController
@RequestMapping(value = "/convertir")
public class APIController {
    
    @Autowired
    private ConvertidorTemperatura convertidor;
    
    @RequestMapping(method = RequestMethod.GET, value = "/{grados}/{tipo}")
    public ResponseEntity<?> getTemperatura(@PathVariable double grados, @PathVariable String tipo){
        try{
            return new ResponseEntity<>(convertidor.getConversionTemperatura(grados, tipo), HttpStatus.ACCEPTED);
        }catch (Exception ex){
            return new ResponseEntity<>("No se pudo realizar la conversión", HttpStatus.FORBIDDEN);
        }
    }
}
