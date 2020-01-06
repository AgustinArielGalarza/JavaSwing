package cambioestadoventana;

import java.awt.Frame;
import javax.swing.*;
import java.awt.event.*;

public class CambioEstadoVentana {

    public static void main(String[] args) {

        marcoEstado miMarcoEstado = new marcoEstado();
        miMarcoEstado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class marcoEstado extends JFrame{
    public marcoEstado(){
        setVisible(true);
        setBounds(300, 200, 500, 500);
        cambiaEstado nuevoEstado = new cambiaEstado();
        addWindowStateListener(nuevoEstado);
    }

}
class cambiaEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {
        //System.out.println("La ventana ha cambiado de estado");
        //System.out.println(e.getNewState()); imprimira 6
        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana esta a pantalla comppleta");
        }else if (e.getNewState() == Frame.NORMAL){
            System.out.println("la ventana esta normal");
        }else if ( e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana esta minimizada");
        }
    }
}