package Giris;
import java.util.Scanner;
public class hipotenus {

	public static void main(String[] args) {
	//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
	//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
	//Formül = Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢, Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐).
	
	Scanner inp = new Scanner(System.in);
	double a,b,c;
	System.out.print("Ucgenin Dik Kenarlarini Giriniz : ");
	a = inp.nextDouble();
	b = inp.nextDouble();
	c = Math.sqrt((a*a) + (b*b));
	System.out.println("Hipotenus : " +c);
	
	double d,e,f,u,alan;
	System.out.println("Ucgenin Kenar Uzunluklarini Giriniz : ");
	d = inp.nextDouble();
	e = inp.nextDouble();
	f = inp.nextDouble();
	u = (d+e+f)/2;
	alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
	System.out.println("Ucgenin Alani : "+alan);
	}

}
