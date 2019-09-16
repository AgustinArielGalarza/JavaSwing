
package marcocentrado2;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;


public class MarcoCentrado2 {

    public static void main(String[] args) {
        MarcoCentrado mimarco = new MarcoCentrado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
        
        

        
    }
    
}
class MarcoCentrado extends JFrame{
    public MarcoCentrado (){
        Toolkit miPantalla= Toolkit.getDefaultToolkit();
        Dimension tamañoPanatalla=miPantalla.getScreenSize();
        int alturaPantalla=(int) tamañoPanatalla.getHeight();
        int anchoPantalla=(int) tamañoPanatalla.getWidth();
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("Marco centrado");
        Image miIcono=miPantalla.getImage("images.PNG");
        setIconImage(miIcono);
        
    }
    
}