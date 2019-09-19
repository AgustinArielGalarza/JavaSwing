
package primerospasosswing;

import java.awt.Frame;
import javax.swing.JFrame;

public class PrimerosPasosSwing {

    
    public static void main(String[] args) {
    miMarco Marco= new miMarco();
    Marco.setVisible(true); 
    Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class miMarco extends JFrame{
    public  miMarco(){
        //setSize(500, 300);
        //setLocation(500, 300);
        setBounds(500, 300, 550, 200);
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Mi ventana");
    }
    }
    

