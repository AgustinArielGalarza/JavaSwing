package escribiendomarco;

import  javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javafx.scene.shape.Circle;


public class EscribiendoMarco {

    public static void main(String[] args) {

        marcoConTexo MiMarco =new marcoConTexo();
        MiMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
class marcoConTexo extends JFrame{
    public marcoConTexo (){
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Primer Texto");
        LaminaConFigura miLam=new LaminaConFigura();
        add(miLam);
       
       
    }

}
class LaminaConFigura extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawString("Estamos aprendiendo Swing", 100, 100);
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(100, 100, 300, 200);
       // g.drawArc(50, 100, 100, 150, 120, 150);
       Graphics2D g2 =(Graphics2D)g;
       Rectangle2D Rectangulo = new Rectangle2D.Double(100, 200, 200, 150);
       g2.draw(Rectangulo);
       Ellipse2D Ellipse = new Ellipse2D.Double();
       Ellipse.setFrame(Rectangulo);
       g2.draw(Ellipse);
       g2.draw(new Line2D.Double(100, 200, 300, 350));
        double CentroX = Rectangulo.getCenterX();
        double CentroY= Rectangulo.getCenterY();
        double radio=150;
        Ellipse2D CirculoFura = new Ellipse2D.Double();
        CirculoFura.setFrameFromCenter(CentroX, CentroY, CentroX+radio, CentroY+radio);
        g2.draw(CirculoFura);
               
 }
}
