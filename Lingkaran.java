public class Lingkaran extends Bangun_Datar{
    
    private int r;

    public Lingkaran(int r){
        this.r = r;
    }

    public float luas(){
        return(float)(Math.PI*r*r);
    }

    public float keliling(){
        return(float)(2*Math.PI*r);
    }
}
