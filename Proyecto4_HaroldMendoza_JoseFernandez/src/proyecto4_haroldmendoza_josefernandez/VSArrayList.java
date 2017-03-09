package proyecto4_haroldmendoza_josefernandez;

import java.util.ArrayList;

public class VSArrayList extends ADTList {

    int current_capacity;
    int delta;
    ArrayList<Object> array = new ArrayList();

    @Override
    public boolean Insert(Object e, int p) {
        if (p < 0 || p > tamano) {
            return false;
        }//Fin del if
        if (tamano == current_capacity) {
            resize();
        }//Fin del if
        for (int i = tamano; i > p; i--) {
            array.set(i, array.get(i - 1));
        }//Fin del for
        array.set(p, e);
        tamano++;
        return true;
    }//Fin del metodo

    public void resize() {
        ArrayList<Object> temp = new ArrayList(current_capacity + delta);
        //validar memoria
        for (int i = 0; i < current_capacity; i++) {
            temp.set(i, array.get(i));
        }//Fin del for
        array = temp;
        current_capacity += delta;
    }//Fin del metodo

    public VSArrayList(int current_capacity, int delta) {
        this.delta = delta;
        this.current_capacity = current_capacity;
        array = new ArrayList(current_capacity);
        /*
        if (!array) {
            System.out.println("Out of memory");
            System.exit(0);
        }*/
    }//Fin del constructor

    @Override
    public boolean Remove(int p) {
        Object elemento = array.get(p);
        array.set(p, null);
        for (int i = p; i < tamano - 1; i++) { //corre los elementos del arreglo
            array.set(i, array.get(i + 1));
        }//Fin del for
        array.remove(tamano - 1);
        tamano--;
        return true;
    }//Fin del metodo removee

    @Override
    public Object First() {
        return array.get(0);
    }//Fin del metodo first

    @Override
    public Object Last() {
        return array.get(tamano - 1);
    }//Fin del metodo last

    @Override
    public void Clear() {
        for (int i = 0; i < size(); i++) {
            if (array.get(i) != null) {
                array.remove(i);
                array.set(i, null);
            }//Fin del if
        }//Fin del for
    }//Fin del clear

    public int IndexxOf(Object e) {
        int aux = 0;
        for (int i = 0; i < tamano; i++) {
            if (array.get(i).equals(e)) {
                aux = i;
            }//Fin del if
        }//Fin del for
        return aux;
    }//Fin del metodo

    @Override
    public Object Get(int p) {
        return array.get(p);
    }//Fin del metodo get

    public int Capacity() {
        return current_capacity;
    }//Fin del metodo capacity

    @Override
    public boolean IsEmpty() {
        if (tamano == 0) {
            return true;
        } else {
            return false;
        }//FIn del else
    }//Fin del metodo

    @Override
    public boolean IsFull() {
        if (tamano == current_capacity) {
            return true;
        } else {
            return false;
        }//Fin del if
    }//Fin del metodo

}//Fin de la clase
