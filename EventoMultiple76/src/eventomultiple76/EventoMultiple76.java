package eventomultiple76;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


    public class EventoMultiple76 {

        public static void main(String[] args) {

            Marco miMarco=new Marco();
            miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
}
class Marco extends JFrame{
    public Marco(){
        setVisible(true);
        setBounds(300, 200, 500, 500);
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
    
}
class Lamina extends JPanel{
    public Lamina(){
        AccionColor AccionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/img/imagen.png"), Color.yellow);
        AccionColor AccionAzul = new AccionColor("Azul", new ImageIcon("src/img/azul.jpg"), Color.blue);
        AccionColor AccionRojo = new AccionColor("Rojo", new ImageIcon("src/img/rojo.png"), Color.red);
        add(new JButton(AccionAmarillo));
        add(new JButton(AccionAzul));
        add(new JButton(AccionRojo));
        

//        JButton botonAmarillo =new JButton(AccionAmarillo);
//        add(botonAmarillo);


//        JButton botonAmarillo=new JButton("Amarillo");
//        JButton botonAzul=new JButton("Azul");
//        JButton botonRojo=new JButton("Rojo");
//        add(botonAmarillo);
//        add(botonAzul);
//        add(botonRojo);
//        
    
}
    
}
class AccionColor extends AbstractAction{
    public AccionColor(String nombre, Icon icono, Color color_boton){
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner lamina de color"+nombre);
        putValue("Color_de_fondo", color_boton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = (Color)getValue("Color_de_fondo");
    }

}
