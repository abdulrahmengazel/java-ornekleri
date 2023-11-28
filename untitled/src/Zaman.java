public class Zaman {
    int saat;
    int dakika;
    int saniye;

    Zaman(){ //parametresiz kurucu metot

    }

    Zaman(int s,int d,int sn){ //kurucu metot:constructor
        saat=s;
        dakika=d;
        saniye=sn;
    }

    public void ilerle(){
        saniye++;
        if(saniye==60){
            dakika++;
            saniye=0;
            if(dakika==60){
                saat++;
                dakika=0;
                if(saat==24){
                    saat=0;
                }
            }
        }
    }

    public void Yazdir(){
        System.out.println("Zaman= "+saat+":"+dakika+":"+saniye);
    }
}
