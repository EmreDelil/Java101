package Giris;

public class Operatorler {

	public static void main(String[] args) {
		/* Aritmetik Operatörler :
		 *  4 işlem : a + b, a - b, a * b, a / b
		 *  Mod alma(bölümünden çıkan sonucu yazar), 1 arttırıp eksiltme : a % b, a++, b-- 
		 * 
		 *  Atama Operatörleri :
		 *  Eşittir : a = b
		 *  c = c + a : c += a, 4 işlemi ve modu da aynı.
		 *  
		 *  Karşılaştırma Operatörleri :
		 *  Eşitlik : a == b
		 *  Eşit değildir : a != b
		 *  Büyüktür, küçüktür : a > b, a < b
		 *  Büyük, küçük eşit : a >= b, a <= b
		 *  
		 *  Mantıksal Operatörler :
		 *  Ve : a && b 
		 *  Veya : a || b
		 *  Değil : !(a && b)
		 *  
		 *  Koşul Operatörleri :
		 *  a = 5, b = (a==1) ? 1:0
		 *  Çıktısı 0 olur.
		 */
		
		// Aritmetik Operatör
		int a = 5, b = 2;
		System.out.println("Aritmetik Operator");
		System.out.println(a+b);
		System.out.println(a%b);
		
		// Atama Operatörü
		System.out.println("Atama Operatoru");
		System.out.println(a-=b);
		System.out.println(b/=a);
		
		// Karşılaştırma Operatörü
		System.out.println("Karsilastirma Operatoru");
		boolean sonuc1 = a==b;
		boolean sonuc2 = a > b;
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		
		// Mantıksal Operatör
		// Soru 1 = c sayısı d den büyük mü ve e ye eşit mi ?
		System.out.println("Mantiksal Operator Soru 1");
		int c = 5, d = 2, e = 4;
		boolean kosul1 = c>d;
		System.out.println(kosul1);
		boolean kosul2 = c==e;
		System.out.println(kosul2);
		boolean sonuc = kosul1 && kosul2;
		System.out.println(sonuc);
		/* Bu örneğin tek satırda yazımı :
		boolean sonuc = ((c>d) && (c==e));
		System.out.println(sonuc);
		Değili yani tersi = System.out.println(!sonuc); veya
		boolean sonuc = !((c>d) && (c==e)); System.out.println(sonuc);
		Aynısı diğer soru için de geçerli hepsi için geçerli.
		*/
		// Soru = c sayısı d den büyük veya e ye eşit mi ?
		System.out.println("Mantiksal Operator Soru 2");
		boolean kosul3 = c>d;
		System.out.println(kosul3);
		boolean kosul4 = c==e;
		System.out.println(kosul4);
		boolean sonucc = kosul3 || kosul4;
		System.out.println(sonucc);
		
		// Koşul Operatörleri 
		// Soru = Sonuca baktığımda sonuç true ise ekrana doğru, false ise ekrana yanlış yazdırsın.
		System.out.println("Kosul Operatorleri Soru 1");
		String str1 = sonuc ? "Dogru" : "Yanlis";
		String str2 = sonucc ? "Dogru" : "Yanlis";
		System.out.println(str1);
		System.out.println(str2);
		// Başka değerler ile tanımlanabilir yeter ki aynı tanımda olsun(1 0 veya yazı) int veya string gibi
		System.out.println("Kosul Operatorleri Diger Gosterimler");
		int result = sonuc ? 1:0;
		System.out.println(result);
		String str3 = c==e ? "Dogru" : "Yanlis";
		System.out.println(str3);
	}

}
