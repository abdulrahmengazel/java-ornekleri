public class Ogrenci {
    public int No;
    public String isim;

    public void yazdir(){
        System.out.println("ogrenci adi:"+isim+" numarasi:"+No);
    }

    public void NotHesapla(int vize,int finalNot){
        double ort=vize*0.4+finalNot*0.6;
        System.out.println("not:"+ort);
    }
}


