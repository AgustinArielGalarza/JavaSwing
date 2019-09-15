package empleado.jefe;

public class Jefatura extends Empleado implements Jefes{
    
    private double incentivo;
    
    
    public Jefatura(String nom, Double suel, int año, int mes, int dia) {
        super(nom, suel, año, mes, dia);
    }
    public void estableceInsentivo (double b){
        incentivo=b;
            }
    public Double dameSueldo(){
        double sueldoJefe=super.dameSueldo(incentivo);
        return sueldoJefe + incentivo;
    }
    
    public String tomarDecisiones(String decision) {
       return "Un miembro de la direccon a tomado la decision de: "+decision;
    }
    
    public double estableceBonus(double gratificacion){
        double prima =2000 ;
        return Trabajadores.bonusBase+gratificacion+prima;
    }
}
