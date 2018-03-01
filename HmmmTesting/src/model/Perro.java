/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author hmateo
 */
public class Perro {
    private String nombre;
    private String raza;
    private Date fechaNacimiento;
    private int [] accionesHechas; //0- cantar, 1- sentarse y 2- ladrar

    public Perro() {
        this.nombre = "Rufo";
        this.raza = "Fox Terrier";
        this.fechaNacimiento = new Date();
        this.accionesHechas = new int[3];
    }

    public Perro(String nombre, String raza, Date fechaNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.accionesHechas = new int[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int[] getAccionesHechas() {
        return accionesHechas;
    }

    public void setAccionesHechas(int[] accionesHechas) {
        this.accionesHechas = Arrays.copyOf(accionesHechas, accionesHechas.length);
    }
}
