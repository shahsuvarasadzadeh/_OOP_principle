package _Inhertance;

public class Main {
    public static void main(String[] args) {
        Calisan c = new Calisan();
        Akademiysen a = new Akademiysen();
        Memurlar m=new Memurlar();
        m.giris();
        a.giris();
        System.out.println(Akademiysen.giris());
        System.out.println(Memurlar.giris());
    }
}
