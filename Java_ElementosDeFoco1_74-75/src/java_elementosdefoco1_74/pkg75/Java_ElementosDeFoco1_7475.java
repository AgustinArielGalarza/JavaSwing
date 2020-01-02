package java_elementosdefoco1_74.pkg75;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class Java_ElementosDeFoco1_7475 {

    public static void main(String[] args) {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    class Marco extends JFrame{
        public Marco(){
            setVisible(true);
            setBounds(250, 200, 600, 450);
            add(new Lamina());
        }
        
    }
    class Lamina extends JPanel{
        
        public void paintComponent(Graphics g){
            
            super.paintComponent(g);
            setLayout(null);
            
            cuadro1=new JTextField();
            cuadro2=new JTextField();
            
            cuadro1.setBounds(120, 10, 150, 20);
            cuadro2.setBounds(120, 50, 150, 20);
            
            eventoDeFoco foco = new eventoDeFoco();
            
            cuadro1.addFocusListener(foco);
            
            add(cuadro1);
            add(cuadro2);
        }
        
        private class eventoDeFoco implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Ganaste foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = cuadro1.getText();
            boolean comprobacion= false;
            
            for(int i= 0;i<email.length();i++){
                if(email.charAt(i)== '@'){
                    
                    comprobacion = true;
                    
                }
                if(comprobacion){
                    System.out.println("es correcto");
                }else{
                    System.out.println("es incorrecto   ");
                }
            }
        }
        }
            private JTextField cuadro1,cuadro2;
        }

