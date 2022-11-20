package _Inhertance;

public class Calisan {
    String adSoyad, eposta;
    int telefon;
    static int girisSayisi;



    public static int giris(){
        return ++Calisan.girisSayisi;
    }
}
