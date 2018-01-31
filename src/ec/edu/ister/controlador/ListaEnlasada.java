package ec.edu.ister.controlador;
import ec.edu.ister.modelo.Nodo;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class ListaEnlasada {
    int n ; 
    Nodo inicio;
    Nodo fin;
  
    public ListaEnlasada() {
        inicio=null;
        fin=null;
    }
     public void agregarNodoAlInicio(int dato){
         Nodo nuevo=new Nodo(dato);
         nuevo.setEnlace(inicio);
         inicio=nuevo;
         if(fin==null)
             fin=nuevo;
    }
  
    public void agregarNodoAlFinal(int dato){
        Nodo nuevo=new Nodo(dato);
        if(fin!=null){
            fin.setEnlace(nuevo);
            fin=nuevo;
       }
       else{
            fin=nuevo;
            inicio=nuevo;
       }
    }
    public void recorreLista(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.println(aux.getDato());
          aux=aux.getEnlace();
        }
       
    }
   public void eliminarNodos(int numero)
 {
            if(inicio!=null)
            {
  if(inicio.getDato()!=numero)
                {
                    inicio=fin=null;
                }
                else if((inicio==fin)&&(inicio.getDato()!=numero))
  {
                    inicio=inicio.getEnlace();
                }
              
                else
                {
                    Nodo anterior=inicio;
                    Nodo siguiente=inicio.getEnlace();
                    while((siguiente!=null)&&(siguiente.getDato()!=numero))
                    {
                        anterior=siguiente;
                        siguiente=siguiente.getEnlace();
                    }
                    if(siguiente!=null)
                    {
                        anterior.setEnlace(siguiente.getEnlace());
                        if(siguiente==fin)
                        {
                            fin=anterior;
                        }
                    }
                }
            }
        }
public  void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el Item \n\n"
               + "  . . . . . . . . . .  MENU PRINCIPAL  . . . . . . . . . . \n\n"
               + "1.Ingrese la variable para su Inicio\n"
               + "2.Ingrese la variable para su Final\n"
               + "3. Desplazar la  lista\n"
               + "4. Borar un elemento\n"
               + "5.- SALIR....\n\n"));
        
       switch(op){
            case 1:
               agregarNodoAlInicio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
               break; 
           case 2:
            agregarNodoAlFinal(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
               break;
           case 3:
               recorreLista();
               break;
           case 4:
               eliminarNodos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
               break;
          
       }       
    }while (op!=5); 
}
}
