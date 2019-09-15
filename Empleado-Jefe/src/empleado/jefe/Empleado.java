package empleado.jefe;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable, Trabajadores{
    private String nombre;
    private Double sueldo;
    private Date AltaContrato;
    private int id;
    private int idSiguiente;

    public Empleado(String nom, Double suel,int año, int mes, int dia) {
        this.nombre = nom;
        this.sueldo = suel;
        GregorianCalendar calendario =new GregorianCalendar(año, mes -1, dia);
        this.AltaContrato = calendario.getTime();
        ++idSiguiente; 
        id=idSiguiente;
    }
    public Empleado(String nom){
        this(nom,12000.0,2018,3,1);
    } 
    
    
    public String dameNombre(String nom){
        return "Id: "+id+"  nombre : " +nombre;
    }
    public Date dameAltaContrato(String altcon){
        return AltaContrato;
    }
    public Double dameSueldo (Double suel){
        return sueldo;
    }
    public void subeSueldo(double porcentaje){
        double aumento= sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    
    public int compareTo(Object obj){
     Empleado otroEmpleado=(Empleado)obj;
     if(this.sueldo<otroEmpleado.sueldo){
         return -1;
     }else if (this.sueldo>otroEmpleado.sueldo){
         return 1;
     }
        return 0;
 }
   public double estableceBonus(double gratificacion){
       return Trabajadores.bonusBase+gratificacion;     
   }

    
   


}
