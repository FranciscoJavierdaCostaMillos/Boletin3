
package boletin3programacion;


public class Boletin3Programacion {

   
    public static void main(String[] args) {
       Boletin3 consumo1= new Boletin3();
        consumo1.setLitros(50f);
        consumo1.setpGas(1.57F);
        Boletin3 consumo2= new Boletin3(20f,5f,20f,7f);
        System.out.println("Consumo medio =" + consumo2.consumoMed());
        consumo2.setLitros(23f);
        System.out.println("Velocidad media =" + consumo2.getVmed());
    }
    
}
