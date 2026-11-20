package model;

public class Kerucut extends Object3D {
    private double jarijari;
    private double tinggi;

    public Kerucut(String label,double jarijari,double tinggi){
        super(label);
        this.jarijari =jarijari;
        this.tinggi = tinggi;  
    }
    
    public double hitungLuasPermukaan(){
        
    }

    public double hitungVolume(){
        
    }

    @Override 
    public String[][] getKeyValueDetails(){
        
    }
}
