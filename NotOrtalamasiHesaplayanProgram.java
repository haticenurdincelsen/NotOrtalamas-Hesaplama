import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {
    public static void main (String[]args){
        //değişkenler oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;
        //Scanner sınıfını tanımladık
        Scanner inp =new Scanner(System.in);
        //Kullanıcıdan değerleri al
        System.out.print("matematik notunuz");
        mat=inp.nextInt();
        System.out.print("fizik notunuz");
        fizik=inp.nextInt();
        System.out.print("kimya notunuz");
        kimya=inp.nextInt();
        System.out.print("turkce notunuz");
        turkce=inp.nextInt();
        System.out.print("tarih notunuz");
        tarih=inp.nextInt();
        System.out.print("muzik notunuz");
        muzik=inp.nextInt();
        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6;
        System.out.println("ortalamanız:"+sonuc);
        //boolean kosul=sonuc==60;
        boolean kosul1=sonuc>=60;
        boolean kosul2=kosul1;
        String str=(kosul2)?"Sınıfı geçtiniz":"Sınıfta kaldınız";
        System.out.print(str);
    }
}
