package eventoconraton;

import javax.swing.*;
import java.awt.event.*;

public class EventoConRaton72_73 {

    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
    }
    
class Marco extends JFrame{
    public Marco(){
            setVisible(true);
            setBounds(400, 200, 500, 400); 
            eventoDeRaton EventoRaton =new eventoDeRaton();
            addMouseListener(EventoRaton);
}
}
class eventoDeRaton extends MouseAdapter{
//    @Override
//    public void mouseClicked(MouseEvent e){
//        //saber cordenada
//        System.out.println("Has hecho click en X :"+e.getX()+" Y: "+e.getY());
//        //saber cantidad de clicks
//        System.out.println(e.getClickCount());
//    }

    @Override
    public void mousePressed(MouseEvent e){
     // saber que boton del mouse usa
     //   System.out.println(e.getModifiersEx());
     //es 1024 o tamb puedo usar el nombre de clase, que es statico(tengpo que usar nombre de la clase delante) y final (constante).
     if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){ 
         System.out.println("has hecho click Izquiedo");
     }
     else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){ 
         System.out.println("has pulsado la Rueda del raton");
         
     }
     else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){ 
         System.out.println("has hecho click Derecho");
         
     }
     
}
}