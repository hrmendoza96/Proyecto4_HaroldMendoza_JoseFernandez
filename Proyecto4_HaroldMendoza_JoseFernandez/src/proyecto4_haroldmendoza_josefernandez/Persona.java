/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4_haroldmendoza_josefernandez;

import java.util.ArrayList;

/**
 *
 * @author Harold Mendoza
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String ciudad;
    protected String EstadoCivil;
    protected double salario;
    ArrayList<Relationship> relatedPeople = new ArrayList();
    

    public Persona() {
    }

    public Persona(String nombre, int edad, String ciudad, String EstadoCivil, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.EstadoCivil = EstadoCivil;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Relationship> getRelatedPeople() {
        return relatedPeople;
    }

    public void setRelatedPeople(Relationship related) {
        this.relatedPeople.add(related);
    }
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", EstadoCivil=" + EstadoCivil + ", salario=" + salario + '}';
    }
    
    
    
    
    
    
}
