public class Araba {
    // Sınıfın veri üyeleri (fields)
    String marka;
    String model;
    int uretimYili;

    // Sınıfın kurucu metodu (constructor)
    public Araba(String marka, String model, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
    }
    // Sınıfın davranışları (methods)
    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Üretim Yılı: " + uretimYili);
    }
}