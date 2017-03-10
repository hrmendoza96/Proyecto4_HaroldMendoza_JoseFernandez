/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4_haroldmendoza_josefernandez;

/**
 *
 * @author Harold Mendoza
 */
public class Relationship {
    String name;
    /**
     * El Nivel de relacion se define de acuerdo a si es un Familiar,Amigo, o Conocido
     * Familiar: 5
     * Amigo: 10
     * Conocido: 20
     */
    int nivelRelacion;

    public Relationship() {
    }
    

    public Relationship(String name, int nivelRelacion) {
        this.name = name;
        this.nivelRelacion = nivelRelacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNivelRelacion() {
        return nivelRelacion;
    }

    public void setNivelRelacion(int nivelRelacion) {
        this.nivelRelacion = nivelRelacion;
    }

    @Override
    public String toString() {
        return "Relationship{" + "name=" + name + ", nivelRelacion=" + nivelRelacion + '}';
    }
    
    
    
    
}
