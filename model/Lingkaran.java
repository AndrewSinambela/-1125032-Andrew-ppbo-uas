package model;

public class Lingkaran extends Object2D {
    private double sisi;

    public Lingkaran(String label,double sisi){
        super(label);
        this.sisi = sisi;
    }
    
    public double hitungLuas(){
        return 3.14*sisi*sisi;
    }

    public double hitungKeliling(){
        return 3.14*2*sisi;
    }

    @Override 
    public String[][] getKeyValueDetails(){
        
    }
}
