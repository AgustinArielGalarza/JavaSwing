package botones.y.laminas;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotonesYLaminas {

    public static void main(String[] args) {

        Marco miMarco = new Marco();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class Marco extends JFrame{
    public Marco() {
        setTitle("Bones y Eventos");
        setBounds(700, 333, 200, 200);
        Lamina miLamina = new Lamina();
        add(miLamina);
    
}
}
class Lamina extends JPanel {
    JButton botonAzul =new JButton("Azul");
    JButton botonAmarillo = new JButton ("Amarillo");
    JButton botoRojo = new JButton ("Rojo");
    public Lamina(){
        add(botonAzul);
        add(botonAmarillo);
        add(botoRojo);
        colorFondo Amarillo = new colorFondo(Color.YELLOW);
        colorFondo Azul = new colorFondo(Color.BLUE);
        colorFondo Rojo = new colorFondo(Color.RED);
        botonAzul.addActionListener(Azul);
        botonAmarillo.addActionListener(Amarillo);
        botoRojo.addActionListener(Rojo);
}
    private class colorFondo implements ActionListener{
    private Color colorDeFondo; 
//pide un color en el metodo
    public colorFondo (Color c){
    colorDeFondo = c;
}
//aplica el avento al color asignado
    @Override
    public void actionPerformed (ActionEvent e){
    setBackground(colorDeFondo);


}
}
 
}
