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
     * La cantidad de llamadas que nuestro contacto tiene con alguien mas
     */
    int CantidadLlamadas;

    public Relationship() {
    }
    

    public Relationship(String name, int CantidadLlamadas) {
        this.name = name;
        this.CantidadLlamadas = CantidadLlamadas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidadLlamadas() {
        return CantidadLlamadas;
    }

    public void setCantidadLlamadas(int CantidadLlamadas) {
        this.CantidadLlamadas = CantidadLlamadas;
    }

    @Override
    public String toString() {
        return "Relationship{" + "name=" + name + ", Cantidad de Llamadas=" + CantidadLlamadas + '}';
    }
    
    
    
    
}
