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
    /**
     * El Nivel de Relacion se mide de acuerdo a la cantidad de llamadas que 
     * tiene con el nodo padre.
     * 
     * Nivel:
     * 5===> 30>=llamadas
     * 10==> 15>= llamadas <30
     * 20==> 1>=llamadas <15
     */
    int NivelRelacion;

    public Relationship() {
    }
    

    public Relationship(String name, int CantidadLlamadas) {
        this.name = name;
        this.CantidadLlamadas = CantidadLlamadas;
        CalcularNivelRelacion();
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

    public int getNivelRelacion() {
        return NivelRelacion;
    }

    public void setNivelRelacion(int NivelRelacion) {
        this.NivelRelacion = NivelRelacion;
    }
    
    public void CalcularNivelRelacion(){
        if(CantidadLlamadas<15){
            NivelRelacion=20;
        }else if(CantidadLlamadas>=15 && CantidadLlamadas<30){
            NivelRelacion=10;
        }else if(CantidadLlamadas>=30){
            NivelRelacion=5;
        }
    }

    @Override
    public String toString() {
        return "Relationship{" + "name=" + name + ", CantidadLlamadas=" + CantidadLlamadas + ", NivelRelacion=" + NivelRelacion + '}';
    }
    

   
    
    
    
    
}
