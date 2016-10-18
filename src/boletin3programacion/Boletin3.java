
package boletin3programacion;

public class Boletin3 {
    private float kms; 
    private float litros; 
    private float vMed; 
    private float pGas; 
    

    
    
        
        public Boletin3(){
        kms =0;
        litros =0;
        vMed =0;
        pGas =0;
    }
        
    public Boletin3 (float kms, float litros, float vMed, float pGas){
        this.kms =kms;
        this.litros =litros;
        this.vMed =vMed;
        this.pGas =pGas;
    }
    
    public float getKms(){
        return this.kms;
    }
    public void setKms(float kms){
        this.kms = kms;
    }
    
    public float getLitros(){
        return this.litros;
    }
    public void setLitros (float litros){
        this.litros = litros;
    }
    
    public float getVmed(){
        return this.vMed;
    }
    public void setVmed(float vMed){
        this.vMed = vMed;
    }
    
    public float getpGas(){
        return this.pGas;
    }
    public void setpGas (float pGas){
        this.pGas = pGas;
    }   
    
    public float getTempo (){
        float tempo;
        tempo=kms/vMed;
        return tempo;
    }
    
    public float consumoMed(){
        float consumoMed;
        consumoMed= this.litros/(this.kms/100);
        return consumoMed;
    }
    
    public float consumoEuros(){
        float consumoEuros;
        consumoEuros=(this.litros/(this.kms/100)*this.pGas);
        return consumoEuros;
    }
    
    
  
    }
