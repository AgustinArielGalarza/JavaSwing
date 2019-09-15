package empleado.jefe;

import java.util.Arrays;

public class EmpleadoJefe {


    public static void main(String[] args) {
        Jefatura Jefe_RRHH = new Jefatura("Juan", 16000.0, 2010, 2, 3);
        Jefe_RRHH.estableceInsentivo(3000.0);
        Empleado[] emp =new Empleado[6];
        emp[0]=new Empleado("Lautaro", 20000.0, 2015,3, 14);
        emp[1]=new Empleado("Melanie", 12000.0, 2013,6, 23);
        emp[2]=new Empleado("Florencia", 34000.0, 2017,9, 12);
        emp[3]=new Empleado("Alma", 3000.0, 2018,7, 22);
        emp[4]=new Jefatura("Agustin", 50000.0, 2014,4, 2);
        emp[5]=new Jefatura("Ariel", 50000.0, 2013,3, 5);
        Jefatura Jefatura_geremcial = (Jefatura)emp [5];
        Jefatura_geremcial.estableceInsentivo(5000.0);
        
        System.out.println(Jefatura_geremcial.tomarDecisiones("Dar mas dias de vacaciones."));
        System.out.println("El jefe "+Jefatura_geremcial.dameNombre(null)+"  Tiene un bonus de: "+Jefatura_geremcial.estableceBonus(2000));
        System.out.println("EL empleado" +emp[3].dameNombre(null)+"  Tiene un Bonus de "+emp[3].estableceBonus(800));
        
        for (Empleado e : emp){
            e.subeSueldo(3000);
        }
          
        Arrays.sort(emp);
        
        for (Empleado e: emp){
            System.out.println(e.dameNombre(null)
            +"   Sueldo: "+e.dameSueldo(Double.NaN)
                    +"   Fecha de Alta:  "+e.dameAltaContrato(null));
                    }
    
}
}