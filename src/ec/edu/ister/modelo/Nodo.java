package ec.edu.ister.modelo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Nodo {
     int dato;
     Nodo enlace;
   
    public Nodo(int dato){
        this.dato=dato;
        this.enlace=null;
    }
    public Nodo(int dato, Nodo siguiente){
        this.dato=dato;
        this.enlace=siguiente;
  
    }

    public float getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo siguiente) {
        this.enlace= siguiente;
    }
   
}
