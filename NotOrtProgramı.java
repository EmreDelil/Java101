package Giris;
import java.util.Scanner;
public class NotOrtProgramı {

	public static void main(String[] args) {
	/* -Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
	 * ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın. 
	 * -Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise 
	 * ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
	 * Not = If ve Else kullanılmayacak.*/
	int mat, fizik, kimya, turkce, tarih, muzik;
	Scanner inp = new Scanner(System.in);
	
	System.out.print("Matematik Notunuzu Giriniz : ");
	mat = inp.nextInt();
	
	System.out.print("Fizik Notunuzu Giriniz : ");
	fizik = inp.nextInt();
	
	System.out.print("Kimya Notunuzu Giriniz : ");
	kimya = inp.nextInt();
	
	System.out.print("Turkce Notunuzu Giriniz : ");
	turkce = inp.nextInt();
	
	System.out.print("Tarih Notunuzu Giriniz : ");
	tarih = inp.nextInt();
	
	System.out.print("Muzik Notunuzu Giriniz : ");
	muzik = inp.nextInt();
	
	int notToplam = mat + fizik + kimya + turkce + tarih + muzik;
	double notOrt = notToplam/6.0;
	System.out.println("Not Ortalamaniz : " + notOrt);
	
	boolean kosul = notOrt >= 60;
	String sonuc = kosul ? "Sinifi Gecti." : "Sinifta Kaldi";
	System.out.println(sonuc);
	}

}
