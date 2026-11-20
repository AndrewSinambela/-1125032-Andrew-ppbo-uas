package model;

public class Lingkaran extends Object2D {
    private double jarijari;

    public Lingkaran(String label,double jarijari){
        super(label);
        this.jarijari = jarijari;
    }
    
    public double hitungLuas(){
        return 3.14*jarijari*jarijari;
    }

    public double hitungKeliling(){
        return 3.14*2*jarijari;
    }
    

    @Override 
    public String[][] getKeyValueDetails(){
        
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
