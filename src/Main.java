import java.util.Scanner;

public class Main {
    public static void main(String[]   args){

        int mat,fizik,kimya,turkce,tarih,muzik,beden;


        Scanner inp = new Scanner(System.in);

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = inp.nextInt();

        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();

        System.out.print("Beden Notunuz:");
        beden = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + muzik + tarih + beden);
        double sonuc = toplam / 7.0;
        boolean kosul = sonuc >= 60;
        String ortalama = kosul ? " Geçti" : " Kaldı";

        System.out.println("Ortalamanız:" +  sonuc + ortalama);





    }
}