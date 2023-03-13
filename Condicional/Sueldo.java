package Condicional;


/*
Calcular los sueldos de sus empleados, los puesto de los mismo son tre categorias
1. repositor  15.850 + bono de 10%
2. cajero 25.630,89 fijo
3.supervisor 35.560.20 descuento 11% jubilacion


 */
public class Sueldo {

    Double sueldoRepartidor;
    static final double sueldoCajero=25630.89;
    Double sueldoSupervisor;


    public Sueldo(double sueldoRepartidor, double sueldoCajero) {
        this.sueldoRepartidor = sueldoRepartidor;
        this.sueldoSupervisor = sueldoSupervisor;
    }

    public Sueldo(){}

    public Double getSueldoRepartidor() {
        return sueldoRepartidor;
    }

    public void setSueldoRepartidor(Double sueldoRepartidor) {
        this.sueldoRepartidor = sueldoRepartidor;
    }

    public double getSueldoCajero() {
        return sueldoCajero;
    }

    public Double getSueldoSupervisor() {
        return sueldoSupervisor;
    }

    public void setSueldoSupervisor(Double sueldoSupervisor) {
        this.sueldoSupervisor = sueldoSupervisor;
    }

    public static void salarioRepartidor(){

        double sueldoRepositor = 15.850;
        double bono=(sueldoRepositor * 0.9)/100;
        double total= (sueldoRepositor+bono);
        System.out.println(" Salario Repartidor : "+ total);

    }


    public static void sueldoCajero( ){
        final double sueldoCajero= 25630.89;
        System.out.println("Sueldo cajero: "+ sueldoCajero);
    }

    public static void salarioSupervisor(){
        double  salarySupervisor = 35560.20 ;
        double descuento =  (salarySupervisor * 0.11)/100 ;
        double totalSalarySupervisor= (salarySupervisor - descuento);
        System.out.println("Salario supervisor : "+totalSalarySupervisor);

    }

    }

