public class Segitiga extends Bangun_Datar{
    
    private int alas, tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas= alas;
        this.tinggi= tinggi;

    }

    public float luas(){
        return this.alas*tinggi*1/2;
    }
}
