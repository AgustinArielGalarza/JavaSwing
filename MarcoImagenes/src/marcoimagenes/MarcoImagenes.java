package marcoimagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoImagenes {

    public static void main(String[] args) {

        Marco miMarco = new Marco();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class Marco extends JFrame{
    public Marco(){
        setBounds(450, 200, 500, 500);
        setTitle("Implementando imagenes");
        Panel miPanel = new Panel();
        add(miPanel);
        
}
}
class Panel extends JPanel{
    private Image imagen;
    
    // contructor que carga de entrada una URL, la diferencia es que no pide al metodo paintComponent sino ya esta cargada de entrada
    public Panel(){
        try{
            imagen=ImageIO.read(new File("src/img/descarga.png"));
        }catch(IOException e){
            System.out.println("no se han encontrado imagenes");
        }
    }
    
    @Override
    // Metodo de Jpanel heredada para aplicar graficos
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //instancio la altura y anchura de la lamina como int. y la igualo a getW-gatH. luego remplazo (caso de no saber la medida de la lamina).
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        g.drawImage(imagen, 0, 0, null);
        
        for (int i=0; i<500; i++){
            for (int j=0; j<500; j++){ 
                // bien i+j en el primer caso seria 0+0 es decir que ancho * 0=0 y mismo con alto. cuando se cumple la condicion
                //">0" ancho (j) sera uno entonces 1*anchuraImagen sera el resultado y la altura 0.
                //es decir imprimira al lado evitando una primera copia por ensima de la primera imagen insertada.
                if (i+j>0){
          g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen *i, alturaImagen*j);   
                }
            }
        }
        
        
    }
    
}