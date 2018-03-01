/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Perro;

/**
 *
 * @author hmateo
 */
public class PerroController {
    
    public void cantar(Perro p){
        int [] acciones = p.getAccionesHechas();
        System.out.println(p.getNombre() + " va a cantar...");
        System.out.println("Who let the dogs out?");
        for(int i=0; i<4;i++){
            System.out.println("Woof!");
        }
    }
    
    public void sentar(Perro p){
        int [] acciones = p.getAccionesHechas();
        System.out.println(p.getNombre() + " se va a sentar...");
        System.out.println(p.getNombre() + " se ha sentado");
    }
    
    public void consultarAccionesPerro(Perro p){
        int [] acciones = p.getAccionesHechas();
        System.out.println(p.getNombre() + " ha cantado " + acciones[0] + " veces");
        System.out.println(p.getNombre() + " se ha sentado " + acciones[1] + " veces");
        System.out.println(p.getNombre() + " ha ladrado " + acciones[2] + " veces");
    }
    
    public Perro perroPorDefecto(){
        return new Perro();
    }
    
}
