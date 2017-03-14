package smt.s;

import java.util.Scanner;

public class bolme {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("sayı girin:");
		float sayi1 = giris.nextInt();
		System.out.println("sayı girin:");
		float sayi2 = giris.nextInt();
		System.out.println("sonuc:"+sayi1/sayi2);

	}

}
