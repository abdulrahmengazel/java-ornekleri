//Java'da iç içe (nested) sınıflar
public class DisSinif {

    private int disSinifDegisken = 10;

    // İç içe sınıf tanımı
    public class IçSinif {
        public void IçSinifMetodu() {
            System.out.println("İç sınıf metodu çalıştı.");
            System.out.println("Dış sınıfın değişkenine erişim: " + disSinifDegisken);
        }
    }
}