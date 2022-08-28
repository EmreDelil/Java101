package Giris;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
	/* -Java ile yarıçapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
	 * Alan Formülü : π * r * r;
	 * Çevre Formülü : 2 * π * r;
	 * -Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
	 * 𝜋 sayısını = 3.14 alınız.
	 * Formül : (𝜋 * (r*r) * 𝛼) / 360
	 */
	Scanner input = new Scanner(System.in);
	double areaSlice, alpha, area, circ, angle, pi = 3.14;
	int radius;
	System.out.print("Enter the radius of the circle : ");
	radius = input.nextInt();
	
	area = pi*Math.pow(radius,2);
	circ = 2*pi*radius;
	System.out.println("Area of the circle : " +area);
	System.out.println("Circumference of the circle : " +circ);
	
	System.out.println("Enter the measure of the central angle : ");
	angle = input.nextDouble();
	areaSlice = (pi*Math.pow(radius, 2)*angle)/360;
	System.out.println("Area of the circle slice : " +areaSlice);
	}

}
