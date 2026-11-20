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
        return 3.14*jarijari*(tinggi+jarijari);
    }

    public double hitungVolume(){
        return 1/3 * 3.14 *jarijari*jarijari*tinggi;
    }

    @Override 
    public String[][] getKeyValueDetails(){
        return 
    }


    public double getJarijari() {
        return jarijari;
    }


    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }


    public double getTinggi() {
        return tinggi;
    }


    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
