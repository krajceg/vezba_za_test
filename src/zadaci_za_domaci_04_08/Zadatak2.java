package zadaci_za_domaci_04_08;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int x1,x2,x3,y1,y2,y3;
		
		System.out.print("Unesite kordinatu X za T1: ");
		x1 = s.nextInt();
		
		System.out.print("Unesite kordinatu Y za T1: ");
		y1 = s.nextInt();
		
		System.out.print("Unesite kordinatu X za T2: ");
		x2 = s.nextInt();
		
		System.out.print("Unesite kordinatu Y za T2: ");
		y2 = s.nextInt();
		
		System.out.print("Unesite kordinatu X za M: ");
		x3 = s.nextInt();
		
		System.out.print("Unesite kordinatu Y za M: ");
		y3 = s.nextInt();
		
		if ((x3 > x1 && x3 < x2) || (x3 > x2 && x3 < x1)) {
			if ((y3 > y1 && y3 < y2) || (y3> y2 && y3 < y1)) {
				System.out.println("Kliknuto je unutar polja.");
			}
			else {
				System.out.println("Nije kliknuto unutar polja!");
			}
		}
		else {
			System.out.println("Nije kliknuto unutar polja!");
		}

	}

}
