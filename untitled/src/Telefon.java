public class Telefon {
    private String marka;
    String renk;
    private int yil;

    public Telefon(){ //Kurucu metot (constructor)

    }
    public Telefon(int yil){ //Kurucu metot
        if(yil<2010||yil>2022){
            this.yil=2010;
        }
        else{
            this.yil=yil;
        }
    }
    public Telefon(String marka,String renk,int yil){ //Kurucu metot
        this(yil); //public Telefon(int yil) kurucu metot çağrılıyor
        this.marka=marka;
        this.renk=renk;
    }

    //public: her yerden erişilebilir
    //private: sınıfa özel, dışardan erişilmez
    //protected: alt sınıftan erişilebilir

    //Encapsulation: kapsülleme
    //get : veri al
    //set : atama yap
    public void setMarka(String marka){
        this.marka=marka;
    }
    public String getMarka(){
        return marka;
    }

    public void setYil(int yil){
        if(yil<2010||yil>2022){
            this.yil=2010;
        }
        else{
            this.yil=yil;
        }
    }

    public int getYil(){
        return this.yil;
    }
    void aramaYap(){
        System.out.println("Arama yapiliyor");
    }
    void aramaYap(String no){ //overloading:aşırı yükleme
        System.out.println(no+" numarasi araniyor");
    }
    void mesajGonder(){
        System.out.println("Mesaj gonderiliyor");
    }
    void yazdir(){
        System.out.println("marka="+marka+" renk="+renk+" yil="+yil);
    }
}
