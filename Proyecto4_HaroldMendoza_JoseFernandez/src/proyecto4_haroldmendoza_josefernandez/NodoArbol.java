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
public class NodoArbol {
    protected Persona root;
    ArrayList<Persona> Children = new ArrayList();

    public NodoArbol() {
    }

    public NodoArbol(Persona root) {
        this.root = root;
    }

    public Persona getRoot() {
        return root;
    }

    public void setRoot(Persona root) {
        this.root = root;
    }

    public ArrayList<Persona> getChildren() {
        return Children;
    }

    public void setChildren(ArrayList<Persona> Children) {
        this.Children = Children;
    }

    @Override
    public String toString() {
        return "NodoArbol{" + "root=" + root + ", Children=" + Children + '}';
    }
    
    
  
   
   
    
}
