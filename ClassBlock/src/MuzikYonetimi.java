import java.util.ArrayList;

record Muzik(String ad, String sanatci, int sure) {

    public void bilgileriGoster() {
        System.out.println("Şarkı Adı: " + ad());
        System.out.println("Sanatçı: " + sanatci());
        System.out.println("Süre: " + sure() + " saniye");
    }

}

class MuzikKoleksiyonu {
    private final ArrayList<Muzik> koleksiyon;

    public MuzikKoleksiyonu() {
        koleksiyon = new ArrayList<>();
    }

    public void muzikEkle(Muzik muzik) {
        koleksiyon.add(muzik);
    }

    public void koleksiyonuListele() {
        System.out.println("Müzik Koleksiyonu:");
        for (Muzik muzik : koleksiyon) {
            muzik.bilgileriGoster();
            System.out.println("------------");
        }
    }

}
public class MuzikYonetimi {
    public static void main(String[] args) {
        MuzikKoleksiyonu koleksiyon = new
                MuzikKoleksiyonu();

        Muzik muzik1 = new Muzik("Şarkı 1", "Sanatçı 1", 240);
        Muzik muzik2 = new Muzik("Şarkı 2", "Sanatçı 2", 180);

        koleksiyon.muzikEkle(muzik1);
        koleksiyon.muzikEkle(muzik2);

        koleksiyon.koleksiyonuListele();

    }

}
