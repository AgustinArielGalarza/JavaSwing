package focoventan75;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocoVentana extends JFrame implements WindowFocusListener{

    public static void main(String[] args) {
        FocoVentana miVentana1 = new FocoVentana();
        miVentana1.iniciar();

    }
    public void iniciar(){
        marco1=new FocoVentana();
        marco2=new FocoVentana();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(50, 150, 600, 300);
        marco2.setBounds(700, 150, 600, 300);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);  
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        if(e.getSource()== marco1){
            marco1.setTitle("Tengo el foco");
        }else{
            marco2.setTitle("Tengo el foco");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
         if(e.getSource()== marco1){
             marco1.setTitle("");
        }else{
             marco2.setTitle("");
        }
    }
    
    FocoVentana marco1;
    FocoVentana marco2;
    
}
