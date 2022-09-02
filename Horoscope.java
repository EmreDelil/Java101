package KosulluIfadeler;
import java.util.Scanner;
public class Horoscope {

	public static void main(String[] args) {
		
		int day, month;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the day you were born : ");
		day = input.nextInt();
		System.out.print("Enter the month you were born : ");
		month = input.nextInt();		
		
		if(((day < 1) || (day > 31)) || ((month < 1) || (month > 12))) {
			System.out.println("Are you kidding me !?");
		}
		
		switch(month) {
			case 1 :
				if ((day > 0) && (day < 22)) {
					System.out.println("You are a capricorn.");
				}else if ((day >= 22) && (day <= 31)) {
					System.out.println("You are a aquarius.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 2 :
				if ((day > 0) && (day <= 19)) {
					System.out.println("You are a aquarius.");
				}else if ((day > 19) && (day <= 29)) {
					System.out.println("You are a pisces.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 3 :
				if ((day > 0) && (day <= 20)) {
					System.out.println("You are a aquarius.");
				}else if ((day >= 21) && (day <= 31)) {
					System.out.println("You are a aries.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 4 : 
				if ((day > 0) && (day <= 20)) {
					System.out.println("You are a aries.");
				}else if ((day > 20) && (day <= 30)) {
					System.out.println("You are a taurus.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 5 :
				if ((day > 0) && (day <= 21)) {
					System.out.println("You are a taurus.");
				}else if ((day > 21) && (day <= 31)) {
					System.out.println("You are a gemini.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 6 :
				if ((day > 0) && (day <= 22)) {
					System.out.println("You are a gemini.");
				}else if ((day > 22) && (day <= 30)) {
					System.out.println("You are a cancer.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 7 :
				if ((day > 0) && (day <= 22)) {
					System.out.println("You are a cancer.");
				}else if ((day > 22) && (day <= 31)) {
					System.out.println("You are a leo.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 8 : 
				if ((day > 0) && (day <= 22)) {
					System.out.println("You are a leo.");
				}else if ((day > 22) && (day <= 31)) {
					System.out.println("You are a virgo.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 9 :
				if ((day > 0) && (day <= 22)) {
					System.out.println("You are a virgo.");
				}else if ((day > 22) && (day <= 30)) {
					System.out.println("You are a libra.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 10 :
				if ((day > 0) && (day <= 22)) {
					System.out.println("You are a libra.");
				}else if ((day > 22) && (day <= 31)) {
					System.out.println("You are a scorpio.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 11 :
				if ((day > 0) && (day <= 21)) {
					System.out.println("You are a scorpio.");
				}else if ((day > 21) && (day <= 30)) {
					System.out.println("You are a sagittarius.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			case 12 :
				if ((day > 0) && (day <= 21)) {
					System.out.println("You are a sagittarius.");
				}else if ((day > 21) && (day <= 31)) {
					System.out.println("You are a capricorn.");
				}else {
					System.out.println("You have entered incorrectly.");
				}
				break;
			default :
				System.out.println("You have entered incorrectly.");
		}
		
		/* int month, day;
		 * String burc = "";
		 * boolean isError = false;
		 * Doğulan gün ve ay kullanıcıdan alındı.
		 * switch(month) {
		 * 		case 1:
		 * 			if(day >= 1 && day <= 31){
		 * 				if(day < 22){
		 * 					burc = "Oğlak";
		 * 				}else {
		 * 					burc = "Kova";
		 * 				}
		 * 			}else {
		 * 				isError = true;
		 * 			}
		 * 			break;
		 * 		case 2:
		 * 			if(day >= 1 && day <= 28){
		 * 				if(day < 20){
		 * 					burc = "Kova";
		 * 				}else {
		 * 					burc = "Balık";
		 * 				}
		 * 			}else {
		 * 				isError = true;
		 * 			}
		 * 			break;
		 * 		default:
		 * 			isError = true;
		 * }
		 * if (isError){
		 * 		System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyiniz.");
		 * }else {
		 * 		System.out.println("Merhaba, burcunuz : " + burc);
		 * }
		 */

	}

}
