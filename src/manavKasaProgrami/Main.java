package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	static float armut = 2.14f,elma = 3.67f,domates = 1.11f,muz = 0.95f,patlican = 5.00f;
	static int armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
	static float tutar;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Armut Kaç Kilo ? :");
		armutKg = scan.nextInt();
		System.out.println("Elma Kaç Kilo ? :");
		elmaKg = scan.nextInt();
		System.out.println("Domates Kaç Kilo ? :");
		domatesKg = scan.nextInt();
		System.out.println("Muz Kaç Kilo ? :");
		muzKg = scan.nextInt();
		System.out.println("Patlıcan Kaç Kilo ? :");
		patlicanKg = scan.nextInt();
		
		tutar = (armut * armutKg) + (elma* elmaKg) +(domates * domatesKg) +(muz * muzKg) +(patlican * patlicanKg);
		System.out.println("Toplam Tutar :" + tutar + " TL");
	
	}

}
