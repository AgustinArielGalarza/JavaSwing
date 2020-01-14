package eventosdeventana;

import javax.swing.*;
import java.awt.event.*;

public class EventosDeVentana {

    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Marco miMarco1= new Marco();
        miMarco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.setTitle("Primera ventana");
        miMarco1.setTitle("Ventana n°2");
        miMarco.setBounds(200, 300, 500, 350);
        miMarco1.setBounds(800, 300, 500, 350);
    }
    
}
class Marco extends JFrame{
    public Marco(){
//        setTitle("Eventos de Ventana");
//        setBounds(300, 200, 500, 500);

        setVisible(true);
//        M_ventana oyenteVentana = new M_ventana();
//        addWindowListener(oyenteVentana);
//   Sismplifico el codigo anterior
         addWindowListener(new M_ventana());
    }

}
//implemeta el Metodo WindowListener (elcual obliga a rescribir 7 metodos de Ventana)
// una solucion es extender de la clase WindowAdapter (clase puente)heredamos los metodos y que usaremos lo que necesitemos
class M_ventana extends WindowAdapter{
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventan minimizada");
    }

    /*@Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("La venta se cerro");
    }
    
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventan activada");
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }*/
    
}
