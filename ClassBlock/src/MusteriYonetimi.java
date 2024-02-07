//Java'da sınıf kavramı

import java.util.ArrayList;

class Musteri {
    private String ad;
    private String soyad;
    private String telefon;
    private String email;

    public Musteri(String ad, String soyad, String telefon, String email) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.email = email;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public void bilgileriGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Telefon: " + telefon);
        System.out.println("Email: " + email);
    }
}

public class MusteriYonetimi {
    public static void main(String[] args) {
// Müşteri nesnelerini oluşturup bir liste içinde saklama
        ArrayList<Musteri> musteriler = new ArrayList<>();

        musteriler.add(new Musteri("Ahmet", "Yılmaz", "555-1234567", "ahmet@email.com"));
        musteriler.add(new Musteri("Ayşe", "Demir", "555-9876543", "ayse@email.com"));

// Müşteri bilgilerini listeleme
        System.out.println("Müşteri Listesi:");
        for (Musteri musteri : musteriler) {
            musteri.bilgileriGoster();
            System.out.println("------------");
        }

    }

}