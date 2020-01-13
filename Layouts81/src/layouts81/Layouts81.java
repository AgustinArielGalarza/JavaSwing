package layouts81;

import java.awt.FlowLayout;
import javax.swing.*;

public class Layouts81 {

    public static void main(String[] args) {

        Marco miMarco = new Marco();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class Marco extends JFrame{
    public Marco(){
        setBounds(400, 200, 400, 400);
        setTitle("Prueba Accion");
        Panel miPanel = new Panel();
//        FlowLayout Dispocicion = new FlowLayout(FlowLayout.LEFT);
//        miPanel.setLayout(Dispocicion);
        miPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        add(miPanel);
    }
}
class Panel extends JPanel{
    public Panel (){
        add(new JButton("Amarillo"));
        add(new JButton("Azul"));
        add(new JButton("Rojo"));
    }
}