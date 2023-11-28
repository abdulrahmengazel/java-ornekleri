public class Hello {

    public static void main(String[] args) {
        System.out.println("OGRENCI NESNESI:");
        Ogrenci ogr1=new Ogrenci();//Öğrenci sınıfına ait ogr1 adlı bir varlık oluştur
        ogr1.No=1234;
        ogr1.isim="Mehmet";

        Ogrenci ogr2=new Ogrenci();
        ogr2.No=44;
        ogr2.isim="Ali";

        System.out.println("1.ogrenci adi:"+ogr1.isim+" numarasi:"+ogr1.No);
        System.out.println("2.ogrenci adi:"+ogr2.isim+" numarasi:"+ogr2.No);

        ogr1.yazdir();
        ogr2.yazdir();
        ogr1.NotHesapla(50, 90);

        //Zaman sınıf örneği
        System.out.println("------------------");
        System.out.println("ZAMAN NESNESI:");
        Zaman z=new Zaman();
        z.ilerle();
        z.Yazdir();

        //Telefon sınıf örneği
        System.out.println("------------------");
        System.out.println("TELEFON NESNESI:");
        Telefon s10=new Telefon(2012);
        s10.setMarka("Samsung");
        s10.renk="Beyaz";

        s10.aramaYap();
        s10.mesajGonder();
        s10.yazdir();
        s10.setYil(3200);
        int yil= s10.getYil();

        Telefon iphone12=new Telefon();
        iphone12.setMarka("İphone");
        iphone12.renk="Siyah";
        iphone12.setYil(2019);
        iphone12.yazdir();
        System.out.println(iphone12.getYil());
    }

}

