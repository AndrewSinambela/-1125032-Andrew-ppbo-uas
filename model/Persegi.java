package model;

public class Persegi extends Object2D{
    private double sisi;

    public Persegi(String label,double sisi){
        super(label);
        this.sisi = sisi;
    }
    
    public double hitungLuas(){
        return sisi*sisi;
    }

    public double hitungKeliling(){
        return 4*sisi;
    }

    @Override 
    public String[][] getKeyValueDetails(){
        return 
    }

}
