
package operaciones;

import java.awt.Color;
import java.util.ArrayList;
import objetos.Nodo;

public class ListaNodo extends ArrayList<Nodo>{

    public ListaNodo(){
        super();
    }
    public Nodo buscarMenor(){
        Nodo aux = new Nodo();
        aux.setLongitudCamino(9999999);

        for(Nodo nodo:this){
            if(nodo.getLongitudCamino() < aux.getLongitudCamino()&&nodo.getCirculo().getColor()!=Color.blue){
                aux = nodo;                
            }
        }

        return aux;
    }
    public boolean isContenido(Nodo nodo){
        boolean retornado = false;
        for(Nodo n:this){
            if(n == nodo){
                retornado = true;
            }
        }
        return retornado;
    }
}