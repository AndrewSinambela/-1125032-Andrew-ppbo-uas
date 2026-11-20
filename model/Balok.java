package model;

public class Balok extends Object3D {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String label,double panjang,double lebar,double tinggi){
        super(label);
        this.panjang= panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    
    public double hitungLuasPermukaan(){
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    public double hitungVolume(){
        return panjang*lebar*tinggi;
    }

    @Override 
    public String[][] getKeyValueDetails(){
        
    }


    public double getPanjang() {
        return panjang;
    }


    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }


    public double getLebar() {
        return lebar;
    }


    public void setLebar(double lebar) {
        this.lebar = lebar;
    }


    public double getTinggi() {
        return tinggi;
    }


    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
