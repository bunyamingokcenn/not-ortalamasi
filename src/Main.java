import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double ortalama = toplam / 6;

        String durum = ortalama> 60 ? "Sınıfı Geçti": "Sınıfta Kaldı";

        System.out.println("Ders not ortalamanız: " + ortalama);
        System.out.println("Durum: " + durum);

    }
}


